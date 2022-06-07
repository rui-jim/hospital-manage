package org.test.hospitalserver2.service.impl;

import org.test.hospitalserver2.entity.PatientCase;
import org.test.hospitalserver2.mapper.PatientCaseMapper;
import org.test.hospitalserver2.service.PatientCaseService;
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
public class PatientCaseServiceImpl extends ServiceImpl<PatientCaseMapper, PatientCase> implements PatientCaseService {

}
