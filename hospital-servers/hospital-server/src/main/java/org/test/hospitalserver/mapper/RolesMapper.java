package org.test.hospitalserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.test.hospitalutils.entity.RoPrProperties;
import org.test.hospitalserver.entity.Roles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Repository
@Mapper
public interface RolesMapper extends BaseMapper<Roles> {
    
//    @Select("select * from roles")
    List<Roles> getRoles();
    
    RoPrProperties getRoPrPropertiesbyAId(@Param("aId") Integer aId);
    
}
