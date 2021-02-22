package com.qinfengsa.pattern.composite;

import java.util.Collections;

/**
 * 人力资源部
 *
 * @author qinfengsa
 * @date 2021/1/14 9:42
 */
public class HRDepartment extends Company {
    protected HRDepartment(String name) {
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
        System.out.println(getName() + " 员工招聘培训管理");
    }
}
