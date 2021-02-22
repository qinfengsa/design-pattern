package com.qinfengsa.pattern.decorator.beverage;

/**
 * @author qinfengsa
 * @date 2020/10/13 15:56
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 105;
    }
}
