package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.vo.MenuVo;
import org.test.hospitalserver.entity.vo.UserInfo;
import org.test.hospitalserver.mapper.ComponentsMapper;
import org.test.hospitalserver.mapper.RolesPermissionsMapper;
import org.test.hospitalserver.mapper.UserLoginsMapper;
import org.test.hospitalserver.service.UserLoginsService;
import org.test.hospitalutils.entity.Components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@Service
public class UserLoginsServiceImpl extends ServiceImpl<UserLoginsMapper, UserLogins> implements UserLoginsService {
    
    @Autowired
    UserLoginsMapper userLoginsMapper;
    
    @Autowired
    ComponentsMapper componentsMapper;
    @Override
    public UserInfo getUserInfo(String account) {
        UserInfo userInfo = userLoginsMapper.getUserInfo(account);
        log.info("userInfo {}",userInfo);  
        return userInfo;
    }

    @Override
    public List<MenuVo> getMenu(String account) {
//        List<MenuVo> menu = componentsMapper.getMenu(account);
//        List<Components> menu = componentsMapper.getMenu(account);
//        List<MenuVo> list = new ArrayList<>();
//        QueryWrapper<Components> componentsQueryWrapper = new QueryWrapper<>();
//        for(Components c:menu){
//            componentsQueryWrapper.eq("p_id", c.getPId());
//            Components components = componentsMapper.selectOne(componentsQueryWrapper);
//        }
//        log.info("MenuVo {}",menu);
        return null;
    }
}
