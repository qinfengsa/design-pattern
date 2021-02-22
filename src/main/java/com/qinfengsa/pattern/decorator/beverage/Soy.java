package com.qinfengsa.pattern.decorator.beverage;

/**
 * 豆
 *
 * @author qinfengsa
 * @date 2020/10/13 16:31
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.45;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
