package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.UserRoles;
import org.test.hospitalserver.mapper.RolesPermissionsMapper;
import org.test.hospitalserver.mapper.UserRolesMapper;
import org.test.hospitalserver.service.UserRolesService;

@Service
public class UserRolesServiceImpl extends ServiceImpl<UserRolesMapper, UserRoles>  implements UserRolesService {
}
