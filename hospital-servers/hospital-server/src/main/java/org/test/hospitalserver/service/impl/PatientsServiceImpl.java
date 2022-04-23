package org.test.hospitalserver.service.impl;

import org.test.hospitalserver.entity.Patients;
import org.test.hospitalserver.mapper.PatientsMapper;
import org.test.hospitalserver.service.PatientsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Service
public class PatientsServiceImpl extends ServiceImpl<PatientsMapper, Patients> implements PatientsService {

}
