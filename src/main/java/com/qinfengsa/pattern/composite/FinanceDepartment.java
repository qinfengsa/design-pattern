package com.qinfengsa.pattern.composite;

import java.util.Collections;

/**
 * 财务部
 *
 * @author qinfengsa
 * @date 2021/1/14 9:47
 */
public class FinanceDepartment extends Company {
    protected FinanceDepartment(String name) {
        super(name);
    }

    @Override
    protected void add(Company company) {}

    @Override
    protected void remove(Company company) {}

    @Override
    protected void display(int level) {
        System.out.println(String.join("", Collections.nCopies(level, "-")) + getName());
    }

    @Override
    protected void lineOfDuty() {
        System.out.println(getName() + " 公司财务收支管理");
    }
}
