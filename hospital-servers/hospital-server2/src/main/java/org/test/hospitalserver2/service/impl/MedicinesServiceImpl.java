package org.test.hospitalserver2.service.impl;

import org.test.hospitalserver2.entity.Medicines;
import org.test.hospitalserver2.mapper.MedicinesMapper;
import org.test.hospitalserver2.service.MedicinesService;
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
public class MedicinesServiceImpl extends ServiceImpl<MedicinesMapper, Medicines> implements MedicinesService {

}
