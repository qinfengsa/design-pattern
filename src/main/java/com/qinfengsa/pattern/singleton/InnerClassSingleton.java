package com.qinfengsa.pattern.singleton;

/**
 * 内部类单例, 利用Java内部类的单例
 *
 * @author qinfengsa
 * @date 2021/1/4 10:24
 */
public class InnerClassSingleton {

    /** 构造方法私有化，防止被实例化 */
    private InnerClassSingleton() {
        throw new IllegalArgumentException("创建失败");
    }

    public static InnerClassSingleton getInstance() {
        // 在调用getInstance 时, ChildSingleton才会加载,单例才会创建
        return ChildSingleton.instance;
    }

    /** 内部类默认不加载,只有使用的时候才会加载到内存 */
    private static class ChildSingleton {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}
