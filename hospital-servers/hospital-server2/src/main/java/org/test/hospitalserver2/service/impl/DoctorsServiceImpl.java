package org.test.hospitalserver2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.test.hospitalserver2.entity.Doctors;
import org.test.hospitalserver2.entity.vo.DoctorsVo;
import org.test.hospitalserver2.mapper.DoctorsMapper;
import org.test.hospitalserver2.service.DoctorsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@Service
public class DoctorsServiceImpl extends ServiceImpl<DoctorsMapper, Doctors> implements DoctorsService {

    @Autowired
    DoctorsMapper doctorsMapper;
    
    @Override
    public List<DoctorsVo> getList() {
        List<DoctorsVo> doctorsVo = doctorsMapper.getDoctorsVo();
        return doctorsVo;
    }

    @Override
    public Boolean addDoctors(DoctorsVo doctorsVo) {
        return null;
    }
}
