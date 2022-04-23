package org.test.hospitalserver.contro;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.hospitalconfig.exception.LoginException;
import org.test.hospitalsecurity.entity.LoginUser;
import org.test.hospitalserver.entity.Admins;
import org.test.hospitalserver.mapper.AdminsMapper;
import org.test.hospitalserver.mapper.RolesMapper;
import org.test.hospitalserver.service.AdminsService;
import org.test.hospitalserver.service.impl.TestService;
import org.test.hospitalutils.utils.R;


@RestController
@Slf4j
@Api(tags="controller")
public class TestController {
    
    @Autowired
    TestService testService;
    
    @Autowired
    AdminsService adminService;
    @Autowired
    RolesMapper rolesMapper;

    @RequestMapping("/test")
    @PreAuthorize("@elp.check('selectTest')")
    public R test(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info(" authentication = {} ",authentication.getPrincipal());
        log.info("authorities = {}  "+authentication.getAuthorities());
        testService.method();
        return R.ok();
    }
    @PostMapping("/test2")
    @ApiOperation("test")
    public ResponseEntity test2(){


        throw new LoginException("登录失败");
    }
    
}
