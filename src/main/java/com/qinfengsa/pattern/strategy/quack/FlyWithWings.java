package com.qinfengsa.pattern.strategy.quack;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 17:30
 */
@Slf4j
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        log.debug("实现鸭子的飞行");
    }
}
