package com.test.serverslogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.test"})
@MapperScan("com.test.serverslogin.mapper")
public class Application {

    
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    
    
}
