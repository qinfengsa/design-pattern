package com.qinfengsa.pattern.chain;

/**
 * 管理员接口
 *
 * @author qinfengsa
 * @date 2021/1/16 14:53
 */
public abstract class Manager {

    private String name;

    protected Manager(String name) {
        this.name = name;
    }

    // 上级领导
    private Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    protected abstract void handleRequest(Request request);

    protected String getName() {
        return name;
    }

    protected Manager getSuperior() {
        return superior;
    }
}
