package com.qinfengsa.pattern.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * 中介者模式 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 *
 * @author qinfengsa
 * @date 2021/1/16 15:23
 */
@Slf4j
public class MediatorMain {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague colleague1 = new ConcreteColleague("同事1", mediator);
        ConcreteColleague colleague2 = new ConcreteColleague("同事2", mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        colleague1.send("吃饭了吗？");
        colleague2.send("没有,你打算请客吗？");
    }

    static class ConcreteColleague extends AbstractColleague {

        private String name;

        protected ConcreteColleague(String name, Mediator mediator) {
            super(mediator);
            this.name = name;
        }

        public void send(String message) {
            getMediator().send(message, this);
        }

        @Override
        protected void msgNotify(String message) {
            log.debug("{} 收到通知:{}", name, message);
        }

        @Override
        public String toString() {
            return "ConcreteColleague{" + "name='" + name + '\'' + '}';
        }
    }
}
