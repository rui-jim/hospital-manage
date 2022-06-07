package org.test.hospitalserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.vo.RolesVo;
import org.test.hospitalserver.mapper.PermissionsMapper;
import org.test.hospitalserver.service.RolesPermissionsService;
import org.test.hospitalutils.entity.Permissions;
import org.test.hospitalutils.utils.R;

import java.util.ArrayList;
import java.util.List;

@Api(tags="对于权限的接口")
@RequestMapping("/permissions")
@RestController
@Slf4j
public class PermissionsController {
    
    @Autowired
    PermissionsMapper permissionsMapper;
    
    @Autowired
    RolesPermissionsService rolesPermissionsService;
    
    @GetMapping("/list")
    @ApiOperation("获取所有的权限")
    public R getList(){
        List<Permissions> permissions = permissionsMapper.getPermissions();
        log.info("permissionsList {}",permissions);
        return R.ok().data("permissionsList",permissions);
    }
    
    @ApiOperation("为该职位赋予权限")
    @PostMapping("/updatePerOfRole")
    public R updatePerOfRole(@RequestBody RolesVo rolesVo){
        log.info("updatePerOfRole RolesVo {}",rolesVo);
        Boolean success = rolesPermissionsService.updatePerOfRole(rolesVo);
        log.info("success {}",success);
        return R.ok().data("success",success);
    }
    
}
