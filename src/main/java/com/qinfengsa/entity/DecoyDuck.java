package com.qinfengsa.entity;

import com.qinfengsa.pattern.strategy.quack.FlyNoWay;
import com.qinfengsa.pattern.strategy.quack.MuteQuack;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 18:03
 */
@Slf4j
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        log.debug("this is a decoy duck");
    }
}
