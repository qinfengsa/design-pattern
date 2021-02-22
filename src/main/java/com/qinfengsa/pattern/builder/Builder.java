package com.qinfengsa.pattern.builder;

/**
 * @author qinfengsa
 * @date 2021/1/4 13:50
 */
public interface Builder {

    void makeTitle(String title);

    void makeString(String str);

    void makeItems(String[] items);

    void close();
}
