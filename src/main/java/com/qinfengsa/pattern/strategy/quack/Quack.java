package com.qinfengsa.pattern.strategy.quack;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 17:49
 */
@Slf4j
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        log.debug("实现了鸭子呱呱叫");
    }
}
