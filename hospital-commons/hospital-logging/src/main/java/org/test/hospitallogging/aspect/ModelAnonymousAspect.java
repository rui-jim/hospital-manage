package org.test.hospitallogging.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
@Slf4j
public class ModelAnonymousAspect {
    
    @Pointcut("@annotation(org.test.hospitallogging.annotation.ModelAnonymous)")
    public void modelAnonymous(){
    }
    
    @Around("modelAnonymous()")
    public Object modelAround(ProceedingJoinPoint pjp) throws Throwable {
        String s = pjp.getSignature().toLongString();
        log.info("toLongString "+s);
        Object proceed = pjp.proceed();
        log.info("proceed "+proceed);
        return proceed;
    }
}
