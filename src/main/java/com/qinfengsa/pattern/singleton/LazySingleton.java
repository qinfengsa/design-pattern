package com.qinfengsa.pattern.singleton;

import java.util.Objects;

/**
 * 懒汉式 使用的时候才创建实例
 *
 * @author qinfengsa
 * @date 2021/1/4 10:10
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    /** 构造方法私有化，防止被实例化 */
    private LazySingleton() {
        throw new IllegalArgumentException("创建失败");
    }

    public static LazySingleton getInstance() {
        // 双重检查锁
        // 创建对象过程，实例化一个对象要分为三个步骤：
        //
        // 1、分配内存空间；2、初始化对象；3、将内存空间的地址赋值给对应的引用
        //
        // 但是由于重排序的缘故，步骤2、3可能会发生重排序，其过程如下：
        //
        // 1、分配内存空间；2、将内存空间的地址赋值给对应的引用；3、初始化对象
        //
        // 所以变量`instance`必须加`volatile`关键字，禁止重排序
        if (Objects.isNull(instance)) {
            synchronized (LazySingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
