package com.qinfengsa.pattern.bridge;

/**
 * @author qinfengsa
 * @date 2021/1/14 20:15
 */
public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
