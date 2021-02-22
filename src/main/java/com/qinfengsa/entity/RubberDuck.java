package com.qinfengsa.entity;

import com.qinfengsa.pattern.strategy.quack.FlyNoWay;
import com.qinfengsa.pattern.strategy.quack.Squeak;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 18:02
 */
@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        log.debug("this is a rubber duck");
    }
}
