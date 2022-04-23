package org.test.hospitalconfig.exception.handler;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.test.hospitalconfig.exception.LoginException;

@Slf4j
//@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(LoginException.class)
    public void loginExceptionMethod(LoginException e){
        log.info("begin exception handler");
        System.out.println(e.getMessage());
    }
    
}
