package org.test.hospitaldataprovider.service;

import org.test.hospitaldataprovider.entity.Doctors;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitaldataprovider.entity.vo.DoctorsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-04-30
 */
public interface DoctorsService extends IService<Doctors> {

    List<DoctorsVo> getDoctorsList();
    
}
