package org.test.hospitalserver.entity.vo;

import lombok.Data;

import java.util.List;

// 返回可访问的组件信息
@Data
public class MenuVo {
    
    List<ComponentsVo> componentsList;
    
}
