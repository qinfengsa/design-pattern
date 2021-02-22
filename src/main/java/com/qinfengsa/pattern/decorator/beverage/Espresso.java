package com.qinfengsa.pattern.decorator.beverage;

/**
 * @author qinfengsa
 * @date 2020/10/13 15:57
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 250;
    }
}
