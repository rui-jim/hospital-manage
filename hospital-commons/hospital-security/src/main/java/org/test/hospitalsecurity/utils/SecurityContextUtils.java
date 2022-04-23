package org.test.hospitalsecurity.utils;

import org.apache.catalina.security.SecurityUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.test.hospitalsecurity.entity.LoginUser;
import springfox.documentation.spi.service.contexts.SecurityContext;

import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service("el")
public class SecurityContextUtils {
    
    public boolean check(String... permissions){
        LoginUser loginUser = SecurityUtils.getLoginUser();
        List<String> permissionList = loginUser.getPermissionList();
        Stream<String> stream = Arrays.stream(permissions);
        return stream.anyMatch(permissionList::contains);
    }
    
}
