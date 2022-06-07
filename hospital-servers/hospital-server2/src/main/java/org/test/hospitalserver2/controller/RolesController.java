package org.test.hospitalserver2.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.test.hospitalserver2.entity.vo.RolesVo;
import org.test.hospitalserver2.service.RolesService;
import org.test.hospitalutils.utils.R;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@RestController
@RequestMapping("/roles")
@Slf4j
public class RolesController {
    @Autowired
    RolesService rolesService;

    @GetMapping("/getRolesPList")
    public R getRolesPList(){
        List<RolesVo> rolesVo = rolesService.getRolesVo();
        return R.ok().data("rolesVo",rolesVo);
    }

    @PostMapping("/addRole")
    public R addRole(@RequestBody RolesVo rolesVo){
        log.info("rolesVo {}",rolesVo);
        boolean b = rolesService.addRole(rolesVo);
//        return Utils.booleanForR(b);
        return R.ok();
    }
}

