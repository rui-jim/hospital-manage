package com.test.serverslogin.mapper;

import com.test.serverslogin.entity.Roles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface RolesMapper extends BaseMapper<Roles> {
    List<Roles> getRoles();
}
