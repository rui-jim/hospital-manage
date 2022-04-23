package org.test.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.test.demo.entity.Admins;

import java.util.List;

public interface AdminsMapper  extends BaseMapper<Admins> {
    
    List<Admins> getAdmins();
    
}
