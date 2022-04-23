package org.test.hospitalsecurity.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.test.hospitallogging.annotation.ModelAnonymous;
import org.test.hospitalutils.entity.Permissions;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Slf4j
public class LoginUser implements UserDetails {
    
    CurrentUser user;
    List<String> permissionList;

    public LoginUser(CurrentUser user) {
        this.user = user;
    }

    public LoginUser(CurrentUser user, List<Permissions> permissionList) {
        this.user = user;
        List<String> perList = new ArrayList<String>();
        for(Permissions per:permissionList)perList.add(per.getPName());
        this.permissionList = perList;
    }

    @ModelAnonymous(name="getAuthoriteies")
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for(String permission:permissionList){
            grantedAuthorities.add(new SimpleGrantedAuthority(permission));
        }
          
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getAccount();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
