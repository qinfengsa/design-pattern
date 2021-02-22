package com.qinfengsa.pattern.decorator;

import java.util.Objects;

/**
 * @author qinfengsa
 * @date 2021/1/6 14:34
 */
public abstract class Finery extends Person {

    private Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (Objects.nonNull(component)) {
            component.show();
        }
    }
}
