package org.test.hospitalserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.vo.UserInfo;

public interface UserLoginsMapper extends BaseMapper<UserLogins> {

    UserInfo getUserInfo(@Param("account") String account);
    
}
