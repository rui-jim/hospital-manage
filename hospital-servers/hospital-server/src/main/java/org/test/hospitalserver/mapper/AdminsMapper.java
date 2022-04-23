package org.test.hospitalserver.mapper;

import org.test.hospitalserver.entity.Admins;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface AdminsMapper extends BaseMapper<Admins> {

    Admins getAdmins();
    
}
