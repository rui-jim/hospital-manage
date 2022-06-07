package org.test.hospitalserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@ComponentScan("org.test")
@MapperScan("org.test.hospitalserver.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class HospitalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalServerApplication.class,args);
    }

}
