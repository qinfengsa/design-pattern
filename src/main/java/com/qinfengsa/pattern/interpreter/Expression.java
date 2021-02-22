package com.qinfengsa.pattern.interpreter;

/**
 * 解释器接口
 *
 * @author qinfengsa
 * @date 2021/1/16 18:08
 */
public interface Expression {

    // 解析方法
    boolean interpret(String context);
}
