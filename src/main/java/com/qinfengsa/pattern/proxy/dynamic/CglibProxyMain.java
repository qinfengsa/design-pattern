package com.qinfengsa.pattern.proxy.dynamic;

import com.qinfengsa.pattern.proxy.BuyHouse;
import com.qinfengsa.pattern.proxy.BuyHouseImpl;

/**
 * Cglib 动态代理
 *
 * @author qinfengsa
 * @date 2021/1/7 10:59
 */
public class CglibProxyMain {

    public static void main(String[] args) {
        BuyHouse proxy = (BuyHouse) new CglibProxy().getProxy(BuyHouseImpl.class);
        proxy.buyHouse();
    }
}
