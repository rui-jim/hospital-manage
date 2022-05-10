package org.test.hospitaldataprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.test")
@MapperScan("org.test.hospitaldataprovider.mapper")
@SpringBootApplication()
@EnableDiscoveryClient
public class HospitalDataProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalDataProviderApplication.class,args);
    }
    
}
