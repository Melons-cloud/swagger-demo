package com.hemukeji.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//error默认请求
@SpringBootApplication
public class SwaggerDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SwaggerDemoApplication.class, args);
    }

}
