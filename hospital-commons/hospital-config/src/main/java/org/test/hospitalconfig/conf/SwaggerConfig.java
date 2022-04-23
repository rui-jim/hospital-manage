package org.test.hospitalconfig.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableOpenApi //开启Swagger3
public class SwaggerConfig {
    
    @Bean
    public Docket docket()
    {
        System.out.println("======================swagger===================");
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//配置Swagger信息
                .select()
                /**
                 * apis():指定扫描的接口
                 *  RequestHandlerSelectors:配置要扫描接口的方式
                 *       basePackage:指定要扫描的包
                 *       any:扫面全部
                 *       none:不扫描
                 *       withClassAnnotation:扫描类上的注解(参数是类上注解的class对象)
                 *       withMethodAnnotation:扫描方法上的注解(参数是方法上的注解的class对象)
                 */
                .apis(RequestHandlerSelectors.basePackage("com.Controller"))
                /**
                 * paths():过滤路径
                 *  PathSelectors:配置过滤的路径
                 *      any:过滤全部路径
                 *      none:不过滤路径
                 *      ant:过滤指定路径:按照按照Spring的AntPathMatcher提供的match方法进行匹配
                 *      regex:过滤指定路径:按照String的matches方法进行匹配
                 */
                .paths(PathSelectors.any())
                .build();
    }

    //配置Swagger信息
    /*String title, String description,
     String version, String termsOfServiceUrl,
     Contact contact, String license,
     String licenseUrl,
     Collection<VendorExtension> vendorExtensions*/
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "My",
                "My API文档",
                "2.0",//版本信息
                null,
                null,
                /*Contact(String name, String url, String email)*/
                "Apache 2.0",
                null,
                new ArrayList<VendorExtension>());
    }

}