package org.test.hospitalserver.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.test.hospitalserver.entity.Doctors;
import org.test.hospitalserver.entity.vo.DoctorsVo;
import org.test.hospitalserver.entity.vo.RolesVo;
import org.test.hospitalserver.mapper.DoctorsMapper;
import org.test.hospitalserver.service.DoctorsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
@Slf4j
public class DoctorsServiceImpl extends ServiceImpl<DoctorsMapper, Doctors> implements DoctorsService {

    @Autowired
    private DoctorsMapper doctorsMapper;
    
    @Override
    public List<DoctorsVo> getList() {
        List<DoctorsVo> doctorsVo = doctorsMapper.getDoctorsVo();
        return doctorsVo;
    }

    @Override
    public Boolean addDoctors(DoctorsVo doctorsVo) {

        int insert = this.baseMapper.insert(DoctorsVo.convertToDoctors(doctorsVo));
        if(insert==1){
            return true;
        }else {
            return false;
        }
    }


}
