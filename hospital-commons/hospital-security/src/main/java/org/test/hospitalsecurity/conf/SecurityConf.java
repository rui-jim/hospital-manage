package org.test.hospitalsecurity.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.test.hospitalsecurity.filter.UserLoginFilter;
import org.test.hospitalsecurity.filter.UserTokenFilter;
import org.test.hospitalsecurity.utils.TokenManage;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.Duration;
import java.util.Collections;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConf extends WebSecurityConfigurerAdapter {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    TokenManage tokenManage;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                
//                .antMatchers("/test2").permitAll()
//                .anyRequest().permitAll();
        http.cors()
                .configurationSource(corsConfigurationSource())
                .and()
                .csrf()
                .disable();

        http.authorizeRequests()
                .antMatchers("/swagger-ui/**").permitAll()
                .antMatchers(
                        HttpMethod.GET,
                        "/*.html",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/webSocket/**"
                ).permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilter(new UserLoginFilter(authenticationManager(),redisTemplate,tokenManage))
                .addFilter(new UserTokenFilter(authenticationManager(),redisTemplate,tokenManage));
//                .addFilterBefore(new UserTokenFilter(authenticationManager(),redisTemplate,tokenManage), UsernamePasswordAuthenticationFilter.class);
    }
    
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowCredentials(true);

        configuration.setAllowedOrigins(Collections.singletonList("*"));

        configuration.setAllowedMethods(Collections.singletonList("*"));

        configuration.setAllowedHeaders(Collections.singletonList("*"));

        configuration.setMaxAge(Duration.ofHours(1));

        source.registerCorsConfiguration("/**", configuration);

        return source;

    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().mvcMatchers("/api/**",
                "/swagger-resources/**", "/webjars/**", "/v2/**",
                "/swagger-ui/**",
                "/swagger-ui/index.html",
                "/test/**"
//                "/doctors/**"
        );
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println("BC  "+bCryptPasswordEncoder);
        return bCryptPasswordEncoder;
    }
}
