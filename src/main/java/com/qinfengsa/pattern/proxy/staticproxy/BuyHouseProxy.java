package com.qinfengsa.pattern.proxy.staticproxy;

import com.qinfengsa.pattern.proxy.BuyHouse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/7 10:20
 */
@Slf4j
public class BuyHouseProxy implements BuyHouse {

    private final BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        log.debug("买房前准备");
        buyHouse.buyHouse();
        log.debug("买房后装修");
    }
}
