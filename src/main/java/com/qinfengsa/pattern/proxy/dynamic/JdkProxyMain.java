package com.qinfengsa.pattern.proxy.dynamic;

import com.qinfengsa.pattern.proxy.BuyHouse;
import com.qinfengsa.pattern.proxy.BuyHouseImpl;

/**
 * Jdk 动态代理
 *
 * @author qinfengsa
 * @date 2021/1/7 10:57
 */
public class JdkProxyMain {

    public static void main(String[] args) {
        BuyHouse proxy = (BuyHouse) new JdkProxy().getProxy(new BuyHouseImpl());
        proxy.buyHouse();
    }
}
