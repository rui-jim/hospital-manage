package org.test.hospitalserver2.service;

import org.test.hospitalserver2.entity.Roles;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver2.entity.vo.RolesVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
public interface RolesService extends IService<Roles> {
    List<RolesVo> getRolesVo();

    boolean addRole(RolesVo rolesVo);
}
