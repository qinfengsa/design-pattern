package com.qinfengsa.entity;

import com.qinfengsa.pattern.strategy.quack.FlyWithWings;
import com.qinfengsa.pattern.strategy.quack.Quack;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/10 16:20
 */
@Slf4j
public class MallardDuck extends Duck implements Flyable, Quackable {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        log.debug("this is a mallard duck");
    }

    @Override
    public void fly() {
        log.debug("fly");
    }

    @Override
    public void quack() {
        log.debug("quack quack");
    }
}
