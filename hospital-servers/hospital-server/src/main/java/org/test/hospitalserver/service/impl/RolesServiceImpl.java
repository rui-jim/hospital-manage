package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.test.hospitallogging.annotation.ModelAnonymous;
import org.test.hospitalserver.entity.Roles;
import org.test.hospitalserver.entity.vo.RolesVo;
import org.test.hospitalserver.mapper.RolesMapper;
import org.test.hospitalserver.service.RolesPermissionsService;
import org.test.hospitalserver.service.RolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Service
@Slf4j
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements RolesService {
    
    @Autowired
    RolesPermissionsService rolesPermissionsService;
    
    @Autowired
    RolesMapper rolesMapper;

    @ModelAnonymous()
    @Override
    public List<RolesVo> getRolesVo() {
        List<RolesVo> rolesVoList = rolesMapper.getRolesVoList();
        List<RolesVo> rolesVoNoPerList = rolesMapper.getRolesVoNoPerList();
        //去重
        distinctRolesVo(rolesVoList,rolesVoNoPerList);
        return rolesVoList;
    }
    
    private List<RolesVo> distinctRolesVo(List<RolesVo> rolesVoList,List<RolesVo> rolesVoNoPerList){
        RolesVo temp = null;
        for (RolesVo rolesVo : rolesVoList) {
            for (int i = 0; i < rolesVoNoPerList.size(); i++) {
                temp = rolesVoNoPerList.get(i);
                if(temp!=null && rolesVo.getRId().intValue()==temp.getRId().intValue() ){
                    rolesVoNoPerList.set(i,null);
                }
            }
        }
        for (RolesVo storeRole:rolesVoNoPerList) {
            if(storeRole!=null){
                rolesVoList.add(storeRole);
            }
        }
        return rolesVoList;
    }

    @Override
    public boolean addRole(RolesVo rolesVo) {

        return false;
    }

    @ModelAnonymous()
    @Override
    public boolean roleNmae(RolesVo rolesVo) {
        int insert = this.baseMapper.insert(RolesVo.convertToRoles(rolesVo));
        if(insert==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteRole(RolesVo rolesVo) {
        QueryWrapper<Roles> rolesQueryWrapper = new QueryWrapper<>();
        rolesQueryWrapper.eq("r_id",rolesVo.getRId());
        int delete = this.baseMapper.delete(rolesQueryWrapper);
        if(delete==1){
            return true;
        }
        return false;
    }
}
