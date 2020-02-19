package com.hemukeji.swagger.controller;

import com.hemukeji.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
    //只要接口返回值存在实体类，就会被扫描到Swagger中
    @PostMapping(value = "/user")
    public User user(){
       return new User();
    }

    @ApiOperation("Hello控制类")
    @GetMapping(value = "/hello2")
    public String hello2(@ApiParam("用户名") String username){
        return "hello"+username;
    }

    @ApiOperation("Post测试类")
    @GetMapping(value = "/postt")
    public User postt1(@ApiParam("用户名") User user){
        return user;
    }

    @ApiOperation("Hello控制类")
    @GetMapping(value = "/hello3")
    public String hello3(@ApiParam("密码") String password){
        return "hello"+password;
    }
}
