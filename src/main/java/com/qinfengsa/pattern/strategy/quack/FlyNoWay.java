package com.qinfengsa.pattern.strategy.quack;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 17:31
 */
@Slf4j
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        log.debug("不会飞");
    }
}
