package org.test.hospitalserver.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.hospitalsecurity.utils.TokenManage;
import org.test.hospitalserver.entity.vo.ComponentsVo;
import org.test.hospitalserver.entity.vo.MenuVo;
import org.test.hospitalserver.entity.vo.UserInfo;
import org.test.hospitalserver.service.UserLoginsService;
import org.test.hospitalutils.utils.R;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags="用户信息获取")
@Slf4j
public class UserInfoController {
    
    @Autowired
    TokenManage tokenManage;
    
    @Autowired
    UserLoginsService userLoginsService;
    
    @GetMapping("/getInfo")
    public R getInfo(HttpServletRequest request){
        log.info("token {}",request.getHeader("token"));
        String username = tokenManage.getMemberIdByJwtToken(request.getHeader("token"));
        log.info("username  {}",username);
        UserInfo userInfo = userLoginsService.getUserInfo(username);
        
        return R.ok().data("userInfo",userInfo);
    }
    
    @GetMapping("/getMenu")
    public R getMenu(HttpServletRequest request){
        String username = tokenManage.getMemberIdByJwtToken(request.getHeader("token"));
        List<ComponentsVo> menu = userLoginsService.getMenu(username);
        log.info("menu {} ",menu);
        return R.ok().data("menuList",menu);
    }
    
}
