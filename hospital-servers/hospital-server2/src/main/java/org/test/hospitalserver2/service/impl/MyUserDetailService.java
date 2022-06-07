package org.test.hospitalserver2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.test.hospitalsecurity.entity.CurrentUser;
import org.test.hospitalsecurity.entity.LoginUser;
import org.test.hospitalserver2.entity.UserLogins;
import org.test.hospitalserver2.mapper.RolesMapper;
import org.test.hospitalserver2.service.AdminsService;
import org.test.hospitalserver2.service.UserLoginsService;
import org.test.hospitalserver2.service.UserRolesService;
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
        return getLoginUser(tempUser);

//        List<GrantedAuthority> select_list = AuthorityUtils.createAuthorityList("select list");
//        return new User(username,bCryptPasswordEncoder.encode("user"), select_list);
    }
    
    private LoginUser getLoginUser(UserLogins userLogins){
        CurrentUser currentUser = new CurrentUser();
        BeanUtils.copyProperties(userLogins,currentUser);
        currentUser.setPassword(bCryptPasswordEncoder.encode(currentUser.getPassword()));

        List<Permissions> resPer=null;
        if(userLogins.getaId()!=null){
            resPer = getAdminsPermissions(userLogins.getaId());
        }
        if(userLogins.getdId()!=null){
            
        }
        if(userLogins.getpId()!=null){
            
        }
        log.info("======="+resPer);
        LoginUser loginUser = new LoginUser(currentUser,resPer);
        return loginUser;
    }
    
    private List<Permissions> getAdminsPermissions(Integer aId){
        RoPrProperties roPrPropertiesbyAId = rolesMapper.getRoPrPropertiesbyAId(aId);
        log.info("ropro=========>"+roPrPropertiesbyAId);
        return roPrPropertiesbyAId.getPName();
    }
    
}
//    RoPrProperties(rName=管理员, pName=
//            [
//                    Permissions(pId=null, pNickname=null, pName=selectTest2, cId=null), 
//                    Permissions(pId=null, pNickname=null, pName=selectTest, cId=null)],
//        components=[Components{cId=11, path=/test2, name=test2, title=测试2, pId=null, hidden=null}, Components{cId=10, path=/test, name=test, title=测试, pId=null, hidden=null}])