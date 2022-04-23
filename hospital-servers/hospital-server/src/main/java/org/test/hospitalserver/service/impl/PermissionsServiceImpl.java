package org.test.hospitalserver.service.impl;

import org.test.hospitalutils.entity.Permissions;
import org.test.hospitalserver.mapper.PermissionsMapper;
import org.test.hospitalserver.service.PermissionsService;
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
public class PermissionsServiceImpl extends ServiceImpl<PermissionsMapper, Permissions> implements PermissionsService {

}
