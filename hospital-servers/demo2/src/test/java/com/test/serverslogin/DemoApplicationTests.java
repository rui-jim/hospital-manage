package com.test.serverslogin;

import com.test.serverslogin.entity.Roles;
import com.test.serverslogin.mapper.RolesMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    
    @Autowired
    SqlSession sqlSession;
    
    @Test
    public void test2(){
        System.out.println(sqlSession);
        RolesMapper mapper = sqlSession.getMapper(RolesMapper.class);
        System.out.println(mapper);
        List<Roles> roles = mapper.getRoles();
        System.out.println(roles);
    }
    
    @Autowired
    RolesMapper rolesMapper;

    @Test
    public void test(){
        List<Roles> roles = rolesMapper.getRoles();
        System.out.println(roles);
    }
}
