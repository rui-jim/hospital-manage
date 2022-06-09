package org.test.hospitalserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.vo.MenuVo;
import org.test.hospitalserver.entity.vo.UserInfo;

import java.util.List;


public interface UserLoginsService extends IService<UserLogins> {
    UserInfo getUserInfo(String account);

    List<MenuVo> getMenu(String account);
}
