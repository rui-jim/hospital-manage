package org.test.hospitalserver.service.impl;

import org.test.hospitalserver.entity.Admins;
import org.test.hospitalserver.mapper.AdminsMapper;
import org.test.hospitalserver.service.AdminsService;
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
public class AdminsServiceImpl extends ServiceImpl<AdminsMapper, Admins> implements AdminsService {

}
