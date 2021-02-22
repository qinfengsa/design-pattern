package com.qinfengsa.pattern.decorator.beverage;

/**
 * 奶泡
 *
 * @author qinfengsa
 * @date 2020/10/13 16:32
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
