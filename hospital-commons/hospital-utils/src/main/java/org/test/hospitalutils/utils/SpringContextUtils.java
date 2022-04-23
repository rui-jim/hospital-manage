package org.test.hospitalutils.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringContextUtils implements ApplicationContextAware, DisposableBean {
    
    static ApplicationContext applicationContext=null;
    
    public static <T> T getBean(String name){
        return (T) applicationContext.getBean(name);
    }
    
    public static <T> T getBean(Class<T> requireType){
        return applicationContext.getBean(requireType);
    }
    
    @Override
    public void destroy() throws Exception {
        
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
