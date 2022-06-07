package org.test.hospitalserver2.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.test.hospitalserver2.entity.Roles;
import org.test.hospitalserver2.entity.vo.RolesVo;
import org.test.hospitalserver2.mapper.RolesMapper;
import org.test.hospitalserver2.service.RolesPermissionsService;
import org.test.hospitalserver2.service.RolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@Service
@Slf4j
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements RolesService {
    @Autowired
    RolesPermissionsService rolesPermissionsService;

    @Autowired
    RolesMapper rolesMapper;

    @Override
    public List<RolesVo> getRolesVo() {
//        List<Roles> roles = this.baseMapper.selectList(null);
//        rolesPermissionsService.lis
        List<RolesVo> rolesVoList = rolesMapper.getRolesVoList();
        log.info("rolesVoList {}",rolesVoList);
        return rolesVoList;
    }

    @Override
    public boolean addRole(RolesVo rolesVo) {
        //通过rid是否为空判断是否添加角色
        if(StringUtils.isEmpty(rolesVo.getRId())) {
            Roles roles = RolesVo.convertToRoles(rolesVo);
            int insert = this.baseMapper.insert(roles);
            log.info("insert = {}",insert);
            if(insert>0){
                return true;
            }
        }else{
            //添加权限
        }
        return false;
    }
}
