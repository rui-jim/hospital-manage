package org.test.hospitalsecurity.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.test.hospitalsecurity.entity.LoginUser;

public class SecurityUtils {
    
    public static LoginUser getLoginUser(){
        return (LoginUser) SecurityContextHolder.getContext().getAuthentication().getDetails();
    }
    
}
