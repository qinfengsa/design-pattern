package com.qinfengsa.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 第三方登录, 通过委托完成适配
 *
 * @author qinfengsa
 * @date 2021/1/11 14:13
 */
@Slf4j
public class LoginForThirdService {

    // 默认密码
    static String DEFAULT_PWD_QQ = "123456";

    private final LoginService loginService;

    public LoginForThirdService(LoginService loginService) {
        this.loginService = loginService;
    }

    public void loginForQQ(String openid) {
        log.debug("QQ登录");
        loginService.register(openid, DEFAULT_PWD_QQ);
        loginService.login(openid, DEFAULT_PWD_QQ);
    }
}
