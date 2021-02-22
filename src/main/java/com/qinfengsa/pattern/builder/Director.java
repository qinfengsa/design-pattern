package com.qinfengsa.pattern.builder;

/**
 * @author qinfengsa
 * @date 2021/1/4 14:03
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[] {"早上好.", "下午好."});
        builder.makeString("晚上");
        builder.makeItems(new String[] {"晚上好.", "晚安.", "再见."});
        builder.close();
    }
}
