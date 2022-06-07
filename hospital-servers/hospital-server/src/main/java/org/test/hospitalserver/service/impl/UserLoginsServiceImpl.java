package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.mapper.RolesPermissionsMapper;
import org.test.hospitalserver.mapper.UserLoginsMapper;
import org.test.hospitalserver.service.UserLoginsService;

@Service
public class UserLoginsServiceImpl extends ServiceImpl<UserLoginsMapper, UserLogins> implements UserLoginsService {
}
