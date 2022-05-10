package org.test.hospitalserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication
@ComponentScan("org.test")
@MapperScan("org.test.hospitalserver.mapper")
@SpringBootApplication
@EnableDiscoveryClient  //nacos注册
@EnableFeignClients
public class HospitalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalServerApplication.class,args);
    }
}
