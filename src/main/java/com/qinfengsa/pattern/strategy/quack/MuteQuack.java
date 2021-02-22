package com.qinfengsa.pattern.strategy.quack;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 17:55
 */
@Slf4j
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        log.debug("不会叫");
    }
}
