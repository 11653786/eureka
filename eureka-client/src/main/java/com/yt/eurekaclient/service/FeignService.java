package com.yt.eurekaclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 外部调用service
 *
 * @author yangtao
 * @date 2018/9/21下午6:27
 * @Description: TODO
 * FeignClient 注解中的内容表示,spring cloud 客户端
 */
@Service
@FeignClient(value = "eureka-client")
public interface FeignService {


    /**
     * 调用 eureka-client 服务注入的,hello方法（需要匹配服务提供者接口名称）
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

    /**
     * 登陆
     * @param name
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(String name);


}
