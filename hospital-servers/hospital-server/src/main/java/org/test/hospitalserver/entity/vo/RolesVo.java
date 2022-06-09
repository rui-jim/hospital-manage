package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.test.hospitalserver.entity.Doctors;
import org.test.hospitalserver.entity.Roles;
import org.test.hospitalutils.entity.Permissions;

import java.util.List;

@Data
public class RolesVo {
    
    private Integer rId;
    private String rName;

    List<Permissions> permissionsList;

    public static Roles convertToRoles(RolesVo rolesVo){
        Roles roles = new Roles();
        BeanUtils.copyProperties(rolesVo,roles);
        return roles;
    }

    public static RolesVo convertToRolesVo(Roles roles){
        RolesVo rolesVo = new RolesVo();
        BeanUtils.copyProperties(roles,rolesVo);
        return rolesVo;
    }
}
