package org.test.hospitalserver.service.impl;

import org.test.hospitalserver.entity.Doctors;
import org.test.hospitalserver.mapper.DoctorsMapper;
import org.test.hospitalserver.service.DoctorsService;
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
public class DoctorsServiceImpl extends ServiceImpl<DoctorsMapper, Doctors> implements DoctorsService {

}
