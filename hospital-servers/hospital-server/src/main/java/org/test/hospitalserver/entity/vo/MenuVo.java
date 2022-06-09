package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.test.hospitalutils.entity.Components;

import java.util.List;

// 返回可访问的组件信息
@Data
public class MenuVo {
    
    List<ComponentVo> componentsList;
    
}
