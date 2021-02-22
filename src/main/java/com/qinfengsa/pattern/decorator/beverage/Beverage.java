package com.qinfengsa.pattern.decorator.beverage;

/**
 * 饮料
 *
 * @author qinfengsa
 * @date 2020/10/13 15:33
 */
public abstract class Beverage {

    protected String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
