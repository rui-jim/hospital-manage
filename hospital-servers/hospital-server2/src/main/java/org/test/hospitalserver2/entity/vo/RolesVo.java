package org.test.hospitalserver2.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.test.hospitalserver2.entity.Roles;
import org.test.hospitalutils.entity.Permissions;

import java.util.List;

@Data
public class RolesVo {
    
    private Integer rId;
    @TableField("r_name")
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
