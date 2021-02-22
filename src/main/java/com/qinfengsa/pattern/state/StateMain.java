package com.qinfengsa.pattern.state;

/**
 * 状态模式的关键是引入了一个抽象类来专门表示对象的状态，这个类我们叫做抽象状态类，而对象的每一种具体状态类都继承了该类，
 *
 * <p>并在不同具体状态类中实现了不同状态的行为，包括各种状态之间的转换
 *
 * @author qinfengsa
 * @date 2021/1/9 10:15
 */
public class StateMain {

    public static void main(String[] args) {
        WorkContext context = new WorkContext();
        context.setHour(9);
        context.handle();
        context.setHour(10);
        context.handle();
        context.setHour(12);
        context.handle();
        context.setHour(13);
        context.handle();
        context.setHour(14);
        context.handle();
        context.setHour(17);
        context.handle();
        // context.setTaskFinished(true);
        context.handle();
        context.setHour(19);
        context.handle();
        context.setHour(22);
        context.handle();
    }
}
