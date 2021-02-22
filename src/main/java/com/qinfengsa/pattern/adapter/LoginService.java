package com.qinfengsa.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/11 14:13
 */
@Slf4j
public class LoginService {

    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public void register(String username, String password) {
        log.debug("user:{} 注册成功", username);
    }

    /**
     * 登录 方法
     *
     * @param username
     * @param password
     * @return
     */
    public void login(String username, String password) {
        log.debug("user:{} 登录成功", username);
    }
}
