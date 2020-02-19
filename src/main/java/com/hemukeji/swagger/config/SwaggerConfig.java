package com.hemukeji.swagger.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
@Configuration
@EnableSwagger2   //开启Swagger2
public class SwaggerConfig {


    @Bean
    public  Docket docket1(Environment environment){

        //设置要显示的Swagger环境
        Profiles profiles =Profiles.of("dev","test");
        //获取项目的环境:
//        通过enviroment.acceptsProfiles判断是否处在自己设置的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("程序员A")
                .enable(flag)   //是否启动Swagger
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.hemukeji.swagger.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/hemukeji/**"))
                .build();
    }

    @Bean
    public  Docket docket2(Environment environment){

        //设置要显示的Swagger环境
        Profiles profiles =Profiles.of("dev","test");
        //获取项目的环境:
//        通过enviroment.acceptsProfiles判断是否处在自己设置的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("程序员B")
                .enable(flag)   //是否启动Swagger
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.hemukeji.swagger.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/hemukeji/**"))
                .build();
    }

    @Bean
    public  Docket docket3(Environment environment){

        //设置要显示的Swagger环境
        Profiles profiles =Profiles.of("dev","test");
        //获取项目的环境:
//        通过enviroment.acceptsProfiles判断是否处在自己设置的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("程序员C")
                .enable(flag)   //是否启动Swagger
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.hemukeji.swagger.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/hemukeji/**"))
                .build();
    }

    @Bean
    public  Docket docket4(Environment environment){

        //设置要显示的Swagger环境
        Profiles profiles =Profiles.of("dev","test");
        //获取项目的环境:
//        通过enviroment.acceptsProfiles判断是否处在自己设置的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("程序员D")
                .enable(flag)   //是否启动Swagger
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.hemukeji.swagger.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/hemukeji/**"))
                .build();
    }




    //http://localhost:8080/swagger-ui.html

    //配置了Swagger的Docket的bean实例
    @Bean
    public Docket docket(Environment environment){


        //设置要显示的Swagger环境
        Profiles profiles =Profiles.of("dev","test");
        //获取项目的环境:
//        通过enviroment.acceptsProfiles判断是否处在自己设置的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("程序员E")
                .enable(flag)   //是否启动Swagger
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.hemukeji.swagger.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/hemukeji/**"))
                .build();
    }

    private ApiInfo apiInfo(){


        //作者信息
        Contact contact = new Contact("胡金龙", "https://space.bilibili.com/83520869", "18710360575@163.com");
        return new ApiInfo("SwaggerAPI文档",
                "人生没有后悔药，做最好的自己",
                "v1.0",
                "https://space.bilibili.com/83520869",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}
