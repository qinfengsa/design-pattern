package com.qinfengsa.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/7 10:37
 */
@Slf4j
public class JdkProxy implements InvocationHandler {

    // 被代理对象
    private Object target;

    /**
     * 通过方法把被代理对象注入,生成代理的实例
     *
     * @param target
     * @return
     */
    public Object getProxy(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * 代理方法通过反射实现
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        log.debug("买房前准备");
    }

    private void after() {
        log.debug("买房后装修");
    }
}
