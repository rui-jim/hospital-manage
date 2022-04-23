package com.test.serverslogin.mapper;

import com.test.serverslogin.entity.RolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.serverslogin.entity.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-17
 */
@Repository
@Mapper
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    List<Roles> getRoles();
}
