package com.qinfengsa.pattern.proxy;

import com.qinfengsa.pattern.proxy.staticproxy.BuyHouseProxy;

/**
 * 静态代理
 *
 * @author qinfengsa
 * @date 2021/1/7 10:23
 */
public class StaticProxyMain {

    public static void main(String[] args) {
        BuyHouse proxy = new BuyHouseProxy(new BuyHouseImpl());

        proxy.buyHouse();
    }
}
