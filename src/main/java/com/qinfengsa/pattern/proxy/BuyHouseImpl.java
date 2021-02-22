package com.qinfengsa.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/7 10:16
 */
@Slf4j
public class BuyHouseImpl implements BuyHouse {

    @Override
    public void buyHouse() {
        log.debug("我要买房");
    }
}
