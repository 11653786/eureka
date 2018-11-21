package com.yt.eurekaclient.controller;

import com.yt.eurekaclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangtao
 * @date 2018/9/21下午6:32
 * @Description: TODO
 */
@RestController
public class ConsumerController {


    @Autowired
    private FeignService feignService;

    /**
     * 调用外部方法
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/consumer/{name}")
    public String consumer(@PathVariable(value = "name") String name) {
        return feignService.hello(name);
    }

    /**
     * 调用外部登陆方法
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "login")
    public String login(String name) {
        return feignService.login(name);
    }
}
