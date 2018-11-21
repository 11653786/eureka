package com.yt.eureka.server.service;

import org.springframework.stereotype.Service;

/**
 * @author yangtao
 * @date 2018/11/20下午1:48
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String login(String hello) {
        return "登陆成功" + hello;
    }
}
