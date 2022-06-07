package org.test.hospitalserver2.service.impl;

import org.test.hospitalutils.entity.Components;
import org.test.hospitalserver2.mapper.ComponentsMapper;
import org.test.hospitalserver2.service.ComponentsService;
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
public class ComponentsServiceImpl extends ServiceImpl<ComponentsMapper, Components> implements ComponentsService {

}
