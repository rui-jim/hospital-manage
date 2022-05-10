package org.test.hospitaldataprovider.service.impl;

import org.springframework.beans.BeanUtils;
import org.test.hospitaldataprovider.entity.Doctors;
import org.test.hospitaldataprovider.entity.vo.DoctorsVo;
import org.test.hospitaldataprovider.mapper.DoctorsMapper;
import org.test.hospitaldataprovider.service.DoctorsService;
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
 * @since 2022-04-30
 */
@Service
public class DoctorsServiceImpl extends ServiceImpl<DoctorsMapper, Doctors> implements DoctorsService {

    @Override
    public List<DoctorsVo> getDoctorsList() {

        List<Doctors> doctors = this.baseMapper.selectList(null);
        List<DoctorsVo> res = new ArrayList<>();
        DoctorsVo temp=null;
        for(Doctors d:doctors){
            temp = new DoctorsVo();
            BeanUtils.copyProperties(d,temp);
            System.out.println(temp);
            res.add(temp);
        }
        return res;
    }
}
