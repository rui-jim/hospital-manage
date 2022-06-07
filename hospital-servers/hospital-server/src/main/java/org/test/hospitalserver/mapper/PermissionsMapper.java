package org.test.hospitalserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.test.hospitalutils.entity.Permissions;
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
public interface PermissionsMapper extends BaseMapper<Permissions> {
    
    @Select("\n" +
            "select p_id,p_nickname,p_name\n" +
            "from permissions \n" +
            "order by p_id;")
    List<Permissions> getPermissions();
    
}
