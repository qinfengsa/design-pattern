package com.qinfengsa.pattern.visitor;

import java.util.Random;

/**
 * 员工基类
 *
 * @author qinfengsa
 * @date 2021/1/18 9:08
 */
public abstract class Staff {

    private String name;

    // 员工KPI
    private int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 核心方法，接受Visitor的访问
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }
}
