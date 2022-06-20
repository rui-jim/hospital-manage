package org.test.hospitalserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.vo.ComponentsVo;
import org.test.hospitalserver.entity.vo.UserInfo;

import java.util.List;


public interface UserLoginsService extends IService<UserLogins> {
    UserInfo getUserInfo(@Param("account") String account);

    List<ComponentsVo> getMenu(String account);
}
