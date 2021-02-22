package com.qinfengsa.pattern.flyweight;

/**
 * 网站用户
 *
 * @author qinfengsa
 * @date 2021/1/16 17:25
 */
public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
