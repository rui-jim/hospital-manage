package org.test.hospitalserver.service.impl;

import org.test.hospitalserver.mapper.ComponentsMapper;
import org.test.hospitalserver.service.ComponentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.hospitalutils.entity.Components;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Service
public class ComponentsServiceImpl extends ServiceImpl<ComponentsMapper, Components> implements ComponentsService {

}
