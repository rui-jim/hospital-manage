package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.hospitallogging.annotation.ModelAnonymous;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.vo.ComponentsVo;
import org.test.hospitalserver.entity.vo.UserInfo;
import org.test.hospitalserver.mapper.ComponentsMapper;
import org.test.hospitalserver.mapper.UserLoginsMapper;
import org.test.hospitalserver.service.UserLoginsService;
import org.test.hospitalutils.entity.Components;

import java.util.*;

@Slf4j
@Service
public class UserLoginsServiceImpl extends ServiceImpl<UserLoginsMapper, UserLogins> implements UserLoginsService {
    
    @Autowired
    UserLoginsMapper userLoginsMapper;
    
    @Autowired
    ComponentsMapper componentsMapper;

    @ModelAnonymous()
    @Override
    public UserInfo getUserInfo(String account) {
        UserInfo userInfo = userLoginsMapper.getUserInfo(account);
        return userInfo;
    }

    @ModelAnonymous()
    @Override
    public List<ComponentsVo> getMenu(String account) {
        List<Components> menus = componentsMapper.getMenu(account);
        HashMap<Integer, ComponentsVo> res = new HashMap<>();
        List<ComponentsVo> componentsVoList =null;
        Integer pId = null;
        ComponentsVo componentsVo = null;
        for(Components c:menus){
            pId = c.getPId();
            if(pId == null){
                componentsVo = new ComponentsVo();
                BeanUtils.copyProperties(c, componentsVo);
                res.put(c.getCId(), componentsVo);
            }
            if(res.containsKey(pId)){
                componentsVo = res.get(pId);
                List<Components> children = componentsVo.getChildren();
                children.add(c);
                res.put(pId, componentsVo);
            }
        }
        
        return getComList(res);
    }
    
    private List<ComponentsVo> getComList(Map<Integer,ComponentsVo> res){
        ArrayList<ComponentsVo> componentsVos = new ArrayList<>();
        for(Map.Entry<Integer, ComponentsVo> entrie:res.entrySet()){
            componentsVos.add(entrie.getValue());
        }
        return componentsVos;
    }
}
