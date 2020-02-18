package com.hemukeji.swagger.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2   //开启Swagger2
public class SwaggerConfig {

    //http://localhost:8080/swagger-ui.html

    //配置了Swagger的Docket的bean实例
    @Bean
    public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){


        //作者信息
        Contact contact = new Contact("胡金龙", "https://space.bilibili.com/83520869", "18710360575@163.com");
        return new ApiInfo("胡金龙的SwaggerAPI文档",
                "人生没有后悔药，做最好的自己",
                "v1.0",
                "https://space.bilibili.com/83520869",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}
