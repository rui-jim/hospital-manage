package org.test.hospitalserver.mapper;

import org.test.hospitalserver.entity.Patients;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.test.hospitalserver.entity.vo.PatientsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface PatientsMapper extends BaseMapper<Patients> {

    List<PatientsVo> getPatientInfo();
    
}
