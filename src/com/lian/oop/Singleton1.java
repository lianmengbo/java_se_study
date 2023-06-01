package com.lian.oop;

/**
 * ClassName: Singletom
 * Package: com.lian.oop
 * Description: 饿汉式单例模式
 * 只产生一个对象
 *
 * @Author mblian
 * @Create 2023/6/1 11:11
 * @Version 1.0
 */
public class Singleton1 {
    //私有化构造器
    private Singleton1() {
    }
    // 2.内部提供一个当前类的实例
    // 4.此实例也必须静态化
    private static Singleton1 single = new Singleton1();

    public static Singleton1 getInstance(){
        return single;
    }
}
