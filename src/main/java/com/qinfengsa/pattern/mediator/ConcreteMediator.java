package com.qinfengsa.pattern.mediator;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体的中介者
 *
 * @author qinfengsa
 * @date 2021/1/16 16:08
 */
@Slf4j
@Setter
public class ConcreteMediator implements Mediator {

    private AbstractColleague colleague1;

    private AbstractColleague colleague2;

    @Override
    public void send(String message, AbstractColleague colleague) {
        log.debug("{} 发送信息:{}", colleague, message);
        if (colleague == colleague1) {
            colleague2.msgNotify(message);
        } else {
            colleague1.msgNotify(message);
        }
    }
}
