package com.qinfengsa.pattern.decorator.beverage;

/**
 * @author qinfengsa
 * @date 2020/10/13 15:43
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 100;
    }
}
