package com.qinfengsa.pattern.visitor;

import java.util.Random;

/**
 * 工程师
 *
 * @author qinfengsa
 * @date 2021/1/18 9:11
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 代码量
     *
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
