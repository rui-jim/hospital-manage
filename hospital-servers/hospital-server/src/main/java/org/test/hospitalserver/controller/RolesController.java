package org.test.hospitalserver.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.test.hospitalserver.entity.vo.RolesVo;
import org.test.hospitalserver.mapper.RolesMapper;
import org.test.hospitalserver.service.RolesService;
import org.test.hospitalutils.utils.R;
import org.test.hospitalutils.utils.Utils;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@RestController
@Api(tags="角色列表操纵类")
@RequestMapping("/roles")
@Slf4j
public class RolesController {

    @Autowired
    RolesService rolesService;

    @ApiOperation("获取所有角色该角色的权限")
    @GetMapping("/getRolesPList")
    public R getRolesPList(){
        List<RolesVo> rolesVo = rolesService.getRolesVo();
        return R.ok().data("rolesVo",rolesVo);
    }

    @ApiOperation("添加角色|未定义")
    @PostMapping("/addRole")
    public R addRole(@RequestBody RolesVo rolesVo){
        log.info("rolesVo {}",rolesVo);
        boolean b = rolesService.addRole(rolesVo);
//        return Utils.booleanForR(b);
        return R.ok();
    }

    @ApiOperation("通过rName添加角色")
    @PostMapping("/roleName")
    public R roleNmae(@RequestBody RolesVo rolesVo){
        log.info("rolesVo {}",rolesVo);
        boolean b = rolesService.roleNmae(rolesVo);
//        return Utils.booleanForR(b);
        return R.ok().data("success",b);
    }

    @ApiOperation("通过rId删除角色")
    @PostMapping("/deleteRole")
    public R deleteRole(@RequestBody RolesVo rolesVo){
        log.info("rolesVo {}",rolesVo);
        boolean b = rolesService.deleteRole(rolesVo);
//        return Utils.booleanForR(b);
        return R.ok().data("success",b);
    }
    
}

