package org.test.hospitalserver.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import org.test.hospitalserver.entity.vo.AccountsVo;
import org.test.hospitalserver.service.AdminsService;
import org.test.hospitalutils.utils.R;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@RestController
@RequestMapping("/admins")
@Api(tags="账号管理即管理员管理")
@Slf4j
public class AdminsController {
    
    @Autowired
    AdminsService adminsService;
    
    @PostMapping("/accountsList")
    @ApiOperation("获取账号列表")
    @PreAuthorize("@sc.check('selectAccount')")
    public R getAccountsList(){
        List<AccountsVo> list = adminsService.getAccountsList();
        return R.ok().data("accountsList",list);
    }
    
    @PostMapping("/submitUpdate")
    @ApiOperation("接受账户修改")
    @PreAuthorize("@sc.check('addAccount','updateAccount')")
    public R submitUpdate(@RequestBody AccountsVo accountsVo){
        R rest = adminsService.updateAccountsInfo(accountsVo);
        return rest;
    }
    
    @GetMapping("/deleteAccount/{uid}")
    @ApiOperation("删除账户")
    @PreAuthorize("@sc.check('deleteAccount')")
    public R deleteAcount(@PathVariable("uid") Integer uid){
        R res = adminsService.deleteAcount(uid);
        return res;
    }
    
}

