package com.qinfengsa.pattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/6 11:24
 */
@Slf4j
public class Person {

    private String name;

    public Person() {}

    protected Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.print("装扮的" + name);
    }
}
