package com.qinfengsa.pattern.factory.method;

/**
 * 工厂方法 也叫多态工厂模式, 利用多态的性质选择对应的工厂, 然后生产对应的产品
 *
 * @author qinfengsa
 * @date 2021/1/7 14:53
 */
public interface PhoneFactory {

    Phone create();
}
