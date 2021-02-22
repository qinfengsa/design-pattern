package com.qinfengsa.pattern.mediator;

/**
 * 中介接口
 *
 * @author qinfengsa
 * @date 2021/1/16 16:04
 */
public interface Mediator {

    void send(String message, AbstractColleague colleague);
}
