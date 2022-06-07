package org.test.hospitalserver2.service.impl;

import org.test.hospitalserver2.entity.DoctorsPatients;
import org.test.hospitalserver2.mapper.DoctorsPatientsMapper;
import org.test.hospitalserver2.service.DoctorsPatientsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@Service
public class DoctorsPatientsServiceImpl extends ServiceImpl<DoctorsPatientsMapper, DoctorsPatients> implements DoctorsPatientsService {

}
