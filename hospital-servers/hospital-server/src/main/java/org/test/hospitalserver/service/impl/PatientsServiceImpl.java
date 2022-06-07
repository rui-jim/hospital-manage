package org.test.hospitalserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.test.hospitalserver.entity.Patients;
import org.test.hospitalserver.entity.vo.PatientsVo;
import org.test.hospitalserver.mapper.PatientsMapper;
import org.test.hospitalserver.service.PatientsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    PatientsMapper patientsMapper;
    
    @Override
    public List<PatientsVo> getPatientInfo() {
        List<PatientsVo> patientInfo = patientsMapper.getPatientInfo();
        
        return patientInfo;
    }
}
