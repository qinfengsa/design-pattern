package com.qinfengsa.pattern.decorator.beverage;

/**
 * @author qinfengsa
 * @date 2020/10/13 15:54
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 20;
    }
}
