package org.test.hospitalserver2.service.impl;

import org.test.hospitalserver2.mapper.PermissionsMapper;
import org.test.hospitalserver2.service.PermissionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.hospitalutils.entity.Permissions;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@Service
public class PermissionsServiceImpl extends ServiceImpl<PermissionsMapper, Permissions> implements PermissionsService {

}
