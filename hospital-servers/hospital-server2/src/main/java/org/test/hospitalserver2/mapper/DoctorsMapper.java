package org.test.hospitalserver2.mapper;

import org.test.hospitalserver2.entity.Doctors;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.test.hospitalserver2.entity.vo.DoctorsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
public interface DoctorsMapper extends BaseMapper<Doctors> {
    List<DoctorsVo> getDoctorsVo();
}
