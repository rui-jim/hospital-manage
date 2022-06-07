package org.test.hospitalserver2.service;

import org.test.hospitalserver2.entity.Doctors;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver2.entity.vo.DoctorsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
public interface DoctorsService extends IService<Doctors> {
    List<DoctorsVo> getList();

    Boolean addDoctors(DoctorsVo doctorsVo);
}
