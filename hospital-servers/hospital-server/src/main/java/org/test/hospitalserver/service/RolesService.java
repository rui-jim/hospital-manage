package org.test.hospitalserver.service;

import org.springframework.stereotype.Service;
import org.test.hospitalserver.entity.Roles;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver.entity.vo.RolesVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Service
public interface RolesService extends IService<Roles> {

    List<RolesVo> getRolesVo();

    boolean addRole(RolesVo rolesVo);

    boolean roleNmae(RolesVo rolesVo);

    boolean deleteRole(RolesVo rolesVo);
}
