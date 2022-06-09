package org.test.hospitalsecurity.filter;

import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.test.hospitalconfig.exception.LoginException;
import org.test.hospitalsecurity.entity.CurrentUser;
import org.test.hospitalsecurity.entity.LoginUser;
import org.test.hospitalsecurity.utils.TokenManage;
import org.test.hospitalutils.utils.R;
import org.test.hospitalutils.utils.ResponseUtil;
import springfox.documentation.spi.service.contexts.SecurityContext;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
public class UserTokenFilter extends BasicAuthenticationFilter {
    
    RedisTemplate redisTemplate;
    TokenManage tokenManage;
    AuthenticationManager authenticationManager;
    
    public UserTokenFilter(AuthenticationManager authenticationManager, RedisTemplate redisTemplate,    TokenManage tokenManage) {
        super(authenticationManager);
        this.authenticationManager=authenticationManager;
        this.tokenManage=tokenManage;
        this.redisTemplate=redisTemplate;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        if(request.getRequestURI().indexOf("hasLogin") != -1) {
            chain.doFilter(request, response);
            return;
        }
        String token = request.getHeader("token");
        UsernamePasswordAuthenticationToken authenticationToken = getAuthenticationToken(token);
        if(authenticationToken==null){
            log.info("请先通过登录");
            return;
        }
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        chain.doFilter(request,response);
    }

    private UsernamePasswordAuthenticationToken getAuthenticationToken(String token){
        if(StringUtils.isEmpty(token) ||  "".equals(token)){
           return null; 
        }
        Object o = null;
        String name = null;
        try {
            name = tokenManage.getMemberIdByJwtToken(token);
            o = redisTemplate.opsForValue().get(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        List<String> permissions = (List<String>) o;
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        List<String> permissionList = new ArrayList<String>();
        for(String s:permissions){
            authorities.add(new SimpleGrantedAuthority(s));
            permissionList.add(s);
        }
        
        CurrentUser currentUser = new CurrentUser();
        currentUser.setAccount(name);
        LoginUser loginUser = new LoginUser(currentUser);
        loginUser.setPermissionList(permissionList);
        
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(name, null, authorities);
        usernamePasswordAuthenticationToken.setDetails(loginUser);
        return usernamePasswordAuthenticationToken;
    }
}
