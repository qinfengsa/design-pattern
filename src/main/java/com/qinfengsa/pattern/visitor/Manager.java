package com.qinfengsa.pattern.visitor;

import java.util.Random;

/**
 * @author qinfengsa
 * @date 2021/1/18 9:12
 */
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 产品数量
     *
     * @return
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
