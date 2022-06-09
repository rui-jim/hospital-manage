package org.test.hospitalsecurity.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.test.hospitalsecurity.entity.CurrentUser;
import org.test.hospitalsecurity.entity.LoginUser;
import org.test.hospitalsecurity.utils.TokenManage;
import org.test.hospitalutils.utils.R;
import org.test.hospitalutils.utils.ResponseUtil;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class UserLoginFilter extends UsernamePasswordAuthenticationFilter {

    AuthenticationManager authenticationManager;
    Authentication authenticate;
    RedisTemplate redisTemplate;
    TokenManage tokenManage;
            
    public UserLoginFilter(AuthenticationManager authenticationManager,RedisTemplate redisTemplate,TokenManage tokenManage) {
        this.authenticationManager=authenticationManager;
        this.tokenManage=tokenManage;
        this.redisTemplate=redisTemplate;
        this.setPostOnly(true);
        this.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/hosLogin","POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        CurrentUser currentUser=null;
        try {
            currentUser = new ObjectMapper().readValue(request.getInputStream(), CurrentUser.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(currentUser.getAccount(), currentUser.getPassword(), new ArrayList<>()));
        return this.authenticate;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        LoginUser principal = (LoginUser) authResult.getPrincipal();
        String token = tokenManage.getToken(principal.getUsername());
        redisTemplate.opsForValue().set(principal.getUsername(),principal.getPermissionList());
        SecurityContextHolder.getContext().setAuthentication(this.authenticate);
        ResponseUtil.out(response, R.ok().message("登录成功").data("token",token));
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        ResponseUtil.out(response, R.error().message(failed.getMessage()));
    }
    
}
