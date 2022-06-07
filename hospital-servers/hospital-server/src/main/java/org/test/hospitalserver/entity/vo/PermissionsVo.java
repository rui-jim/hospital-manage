package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class PermissionsVo {
    private String pId;
    private String pNickname;
    /**
     * 权限名称
     */
}
