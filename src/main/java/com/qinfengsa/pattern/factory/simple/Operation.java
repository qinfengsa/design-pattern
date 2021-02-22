package com.qinfengsa.pattern.factory.simple;

import lombok.Data;

/**
 * 运算操作
 *
 * @author qinfengsa
 * @date 2021/1/5 15:47
 */
@Data
public abstract   class Operation {

    private double num1, num2;

    public abstract double getResult();
}
