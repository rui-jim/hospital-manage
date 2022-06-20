package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.test.hospitalutils.entity.Components;

import java.util.ArrayList;
import java.util.List;

@Data
public class ComponentsVo {

    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;
    
    private String path;
    
    private String name;


    @TableField("title")
    private String title;
    
    @TableField("p_id")
    private Integer pId;

    private String component;
    @TableField("hidden")
    private String hidden;
    
    List<Components> children = new ArrayList<>();
}
