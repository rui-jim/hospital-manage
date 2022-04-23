package org.test.hospitalserver.service.impl;

import org.test.hospitalserver.entity.PatientCase;
import org.test.hospitalserver.mapper.PatientCaseMapper;
import org.test.hospitalserver.service.PatientCaseService;
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
public class PatientCaseServiceImpl extends ServiceImpl<PatientCaseMapper, PatientCase> implements PatientCaseService {

}
