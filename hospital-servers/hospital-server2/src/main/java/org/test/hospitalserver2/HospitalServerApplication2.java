package org.test.hospitalserver2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication
@ComponentScan("org.test")
@MapperScan("org.test.hospitalserver2.mapper")
@SpringBootApplication
public class HospitalServerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(HospitalServerApplication2.class,args);
    }


}
