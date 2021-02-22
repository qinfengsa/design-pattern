package com.qinfengsa.pattern.adapter;

/**
 * 适配器模式
 *
 * <p>将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 *
 * <p>适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 *
 * @author qinfengsa
 * @date 2021/1/11 10:51
 */
public class AdapterMain {

    public static void main(String[] args) {

        LoginService loginService = new LoginService();

        LoginForThirdService loginForThirdService = new LoginForThirdService(loginService);
        String openid = "QweIJHG";
        loginForThirdService.loginForQQ(openid);

        loginService.login("qin", "123456");
    }
}
