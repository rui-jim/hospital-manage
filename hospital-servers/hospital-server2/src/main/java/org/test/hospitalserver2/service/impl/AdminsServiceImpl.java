package org.test.hospitalserver2.service.impl;

import org.test.hospitalserver2.entity.Admins;
import org.test.hospitalserver2.mapper.AdminsMapper;
import org.test.hospitalserver2.service.AdminsService;
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
public class AdminsServiceImpl extends ServiceImpl<AdminsMapper, Admins> implements AdminsService {

}
