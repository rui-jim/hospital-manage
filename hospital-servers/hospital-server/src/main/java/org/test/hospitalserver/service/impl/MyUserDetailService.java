package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.test.hospitalconfig.exception.LoginException;
import org.test.hospitalsecurity.entity.CurrentUser;
import org.test.hospitalsecurity.entity.LoginUser;
import org.test.hospitalserver.entity.*;
import org.test.hospitalserver.mapper.RolesMapper;
import org.test.hospitalserver.service.AdminsService;
import org.test.hospitalserver.service.UserLoginsService;
import org.test.hospitalserver.service.UserRolesService;
import org.test.hospitalutils.entity.Permissions;
import org.test.hospitalutils.entity.RoPrProperties;

import java.util.List;

@Slf4j
@Service
public class MyUserDetailService implements UserDetailsService {
    
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserLoginsService userLoginService;
    @Autowired
    AdminsService adminsService;
    @Autowired
    UserRolesService userRolesService;

    @Autowired
    RolesMapper rolesMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<UserLogins> userLoginsQueryWrapper = new QueryWrapper<>();
        userLoginsQueryWrapper.eq("account",username);
        UserLogins tempUser = userLoginService.getOne(userLoginsQueryWrapper);
        if(tempUser!=null){
            return getLoginUser(tempUser);    
        }
        throw new UsernameNotFoundException("所登录的账户不存在");
    }
    
    private LoginUser getLoginUser(UserLogins userLogins){
        CurrentUser currentUser = new CurrentUser();
        BeanUtils.copyProperties(userLogins,currentUser);
        currentUser.setPassword(bCryptPasswordEncoder.encode(currentUser.getPassword()));

        List<Permissions> resPer = getAccountPermissions(userLogins.getUId());
        LoginUser loginUser = new LoginUser(currentUser,resPer);
        return loginUser;
    }
    
    private List<Permissions> getAccountPermissions(Integer uId){
        RoPrProperties roPrPropertiesbyAId = rolesMapper.getRoPrPropertiesbyUId(uId);
        return roPrPropertiesbyAId.getPName();
    }
    
}