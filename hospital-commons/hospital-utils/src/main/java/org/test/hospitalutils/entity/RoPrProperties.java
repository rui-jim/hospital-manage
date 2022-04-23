package org.test.hospitalutils.entity;

import io.swagger.v3.oas.models.Components;
import lombok.Data;
import org.test.hospitalutils.entity.Permissions;

import java.util.List;

@Data
public class RoPrProperties {
    
    private String rName;
    private List<Permissions> pName;
    private List<Components> components;
    
}
