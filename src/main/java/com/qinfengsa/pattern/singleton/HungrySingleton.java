package com.qinfengsa.pattern.singleton;

/**
 * 饿汉式单例,不管用不用，先实例化出来再说
 *
 * @author qinfengsa
 * @date 2021/1/4 10:04
 */
public class HungrySingleton {
    // 直接new
    private static final HungrySingleton instance = new HungrySingleton();

    /** 构造方法私有化，防止被实例化 */
    private HungrySingleton() {
        throw new IllegalArgumentException("创建失败");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
