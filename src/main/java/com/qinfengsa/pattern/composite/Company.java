package com.qinfengsa.pattern.composite;

/**
 * 公司部门抽象
 *
 * @author qinfengsa
 * @date 2021/1/14 9:09
 */
public abstract class Company {
    private String name;

    protected Company(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void remove(Company company);

    protected abstract void display(int level);

    protected abstract void lineOfDuty();

    protected String getName() {
        return name;
    }
}
