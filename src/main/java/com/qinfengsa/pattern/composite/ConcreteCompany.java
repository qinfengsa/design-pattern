package com.qinfengsa.pattern.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体公司
 *
 * @author qinfengsa
 * @date 2021/1/14 9:34
 */
@Slf4j
public class ConcreteCompany extends Company {

    List<Company> children = new ArrayList<>();

    protected ConcreteCompany(String name) {
        super(name);
    }

    @Override
    protected void add(Company company) {
        this.children.add(company);
    }

    @Override
    protected void remove(Company company) {
        this.children.remove(company);
    }

    @Override
    protected void display(int level) {
        System.out.println(String.join("", Collections.nCopies(level, "-")) + getName());
        for (Company child : children) {
            child.display(level + 2);
        }
    }

    @Override
    protected void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
