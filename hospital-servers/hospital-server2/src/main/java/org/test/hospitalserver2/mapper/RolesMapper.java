package org.test.hospitalserver2.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.test.hospitalserver2.entity.Roles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.test.hospitalserver2.entity.vo.RolesVo;
import org.test.hospitalutils.entity.RoPrProperties;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@Repository
public interface RolesMapper extends BaseMapper<Roles> {
    List<Roles> getRoles();

    RoPrProperties getRoPrPropertiesbyAId(@Param("aId") Integer aId);

    List<RolesVo> getRolesVoList();
}
