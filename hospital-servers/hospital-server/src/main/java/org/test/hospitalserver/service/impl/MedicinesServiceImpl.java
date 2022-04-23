package org.test.hospitalserver.service.impl;

import org.test.hospitalserver.entity.Medicines;
import org.test.hospitalserver.mapper.MedicinesMapper;
import org.test.hospitalserver.service.MedicinesService;
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
public class MedicinesServiceImpl extends ServiceImpl<MedicinesMapper, Medicines> implements MedicinesService {

}
