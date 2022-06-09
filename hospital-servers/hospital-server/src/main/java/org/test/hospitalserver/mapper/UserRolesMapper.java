package org.test.hospitalserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.UserRoles;

public interface UserRolesMapper extends BaseMapper<UserRoles> {

    int insertURbyAccount(@Param("u_id") Integer u_id, @Param("r_id") Integer r_id);
    
}
