package org.test.hospitalserver.service;

import org.test.hospitalserver.entity.RolesPermissions;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver.entity.vo.RolesVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface RolesPermissionsService extends IService<RolesPermissions> {

    Boolean updatePerOfRole(RolesVo rolesVo);
    
    
}
