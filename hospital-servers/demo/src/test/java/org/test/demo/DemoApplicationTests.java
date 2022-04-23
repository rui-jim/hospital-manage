package org.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.test.demo.entity.Admins;
import org.test.demo.mapper.AdminsMapper;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    AdminsMapper adminsMapper;

    @Test
    void test(){
        List<Admins> admins = adminsMapper.getAdmins();
        System.out.println(admins);
    }
}
