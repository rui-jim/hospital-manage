package com.test.serverslogin.controller;


import com.test.serverslogin.entity.Roles;
import com.test.serverslogin.mapper.RolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author my
 * @since 2022-04-17
 */
@RestController
@RequestMapping("/serverslogin/role-permission")
public class RolePermissionController {
    @Autowired
    RolePermissionMapper rolePermissionMapper;

    @RequestMapping("/test")
    public String string(){
        System.out.println(rolePermissionMapper);
        List<Roles> roles = rolePermissionMapper.getRoles();
        System.out.println(roles);
        return "ASDSA";
    }
}

