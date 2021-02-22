package com.qinfengsa.pattern.proxy.dynamic;

import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author qinfengsa
 * @date 2021/1/7 10:37
 */
@Slf4j
public class CglibProxy implements MethodInterceptor {

    /**
     * 通过Class 生成 代理对象
     *
     * @param targetClass
     * @return
     */
    public Object getProxy(Class<?> targetClass) {
        Enhancer enhancer = new Enhancer();
        // 生成一个继承targetClass的子类
        enhancer.setSuperclass(targetClass);
        // 回调父类的方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理方法通过反射实现
     *
     * @param obj 被代理对象
     * @param method
     * @param args 参数列表
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
            throws Throwable {
        before();
        proxy.invokeSuper(obj, args);
        after();
        return null;
    }

    private void before() {
        log.debug("买房前准备");
    }

    private void after() {
        log.debug("买房后装修");
    }
}
