package com.qinfengsa.entity;

import com.qinfengsa.pattern.strategy.quack.FlyBehavior;
import com.qinfengsa.pattern.strategy.quack.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * 鸭子 基类
 *
 * @author qinfengsa
 * @date 2020/10/10 15:41
 */
@Slf4j
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void swim() {
        log.debug("swim");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
