package org.test.hospitalserver.contro;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.test.hospitalconfig.exception.LoginException;
import org.test.hospitalserver.mapper.RolesMapper;
import org.test.hospitalserver.service.AdminsService;
import org.test.hospitalutils.utils.R;

import javax.servlet.http.HttpServletRequest;


@RestController
@Slf4j
@Api(tags="controller")
@RequestMapping("/test")
@CrossOrigin
public class TestController {
    
    @Autowired
    AdminsService adminService;
    @Autowired
    RolesMapper rolesMapper;


    
}
