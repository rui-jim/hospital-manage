package org.test.hospitalconfig.exception.handler;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.test.hospitalconfig.exception.LoginException;
import org.test.hospitalutils.utils.R;
import org.test.hospitalutils.utils.ResponseUtil;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(LoginException.class)
    public R loginExceptionMethod(LoginException e){
        log.info("begin exception handler loginException {} {}",e.getMessage());
        return R.error();
    }
    
}
