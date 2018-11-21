package com.yt.eureka.server.controller;

import com.yt.eureka.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangtao
 * @date 2018/9/21下午6:15
 * @Description: TODO
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/info")
    public String info() {
        return "hello eureka，this is eureka-client messge";
    }

    /**
     * 服务提供者
     *
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name + "，this is eureka-client messge";
    }

    @RequestMapping("/login")
    public String login(String name) {
        return userService.login(name);
    }
}

