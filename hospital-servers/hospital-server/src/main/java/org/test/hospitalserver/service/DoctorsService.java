package org.test.hospitalserver.service;

import org.test.hospitalserver.entity.Doctors;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver.entity.vo.DoctorsVo;
import org.test.hospitalserver.entity.vo.RolesVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface DoctorsService extends IService<Doctors> {

    List<DoctorsVo> getList();

    Boolean addDoctors(DoctorsVo doctorsVo);
    
}
