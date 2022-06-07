package org.test.hospitalserver2.service.impl;

import org.test.hospitalserver2.entity.Patients;
import org.test.hospitalserver2.mapper.PatientsMapper;
import org.test.hospitalserver2.service.PatientsService;
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
public class PatientsServiceImpl extends ServiceImpl<PatientsMapper, Patients> implements PatientsService {

}
