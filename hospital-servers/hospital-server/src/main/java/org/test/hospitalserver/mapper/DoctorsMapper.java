package org.test.hospitalserver.mapper;

import org.test.hospitalserver.entity.Doctors;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.test.hospitalserver.entity.vo.DoctorsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface DoctorsMapper extends BaseMapper<Doctors> {

    List<DoctorsVo> getDoctorsVo();
    
}
