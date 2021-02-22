package com.qinfengsa.pattern.visitor;

/**
 * 访问者接口
 *
 * @author qinfengsa
 * @date 2021/1/18 9:09
 */
public interface Visitor {

    /**
     * 访问工程师类型
     *
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     *
     * @param manager
     */
    void visit(Manager manager);
}
