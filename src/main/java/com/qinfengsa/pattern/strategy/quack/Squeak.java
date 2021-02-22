package com.qinfengsa.pattern.strategy.quack;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 17:53
 */
@Slf4j
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        log.debug("橡皮鸭吱吱叫");
    }
}
