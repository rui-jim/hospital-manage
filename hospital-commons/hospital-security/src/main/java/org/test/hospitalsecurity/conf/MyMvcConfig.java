package org.test.hospitalsecurity.conf;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 下面这几行代码就是配置拦截器并放行部分接口
//        registry.addInterceptor(new LoginHandlerInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login.html","/u/login","/css","/*.js","/excel/add","/we_xin/test","/we_xin/test2");
//    }
}
