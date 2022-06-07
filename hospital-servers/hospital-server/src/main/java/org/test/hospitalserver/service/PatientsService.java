package org.test.hospitalserver.service;

import org.test.hospitalserver.entity.Patients;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver.entity.vo.PatientsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface PatientsService extends IService<Patients> {

    List<PatientsVo> getPatientInfo();
}
