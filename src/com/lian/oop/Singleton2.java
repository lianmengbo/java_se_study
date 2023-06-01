package com.lian.oop;

/**
 * ClassName: Singleton2
 * Package: com.lian.oop
 * Description: 懒汉式单例模式
 *  //随后初始化
 * @Author mblian
 * @Create 2023/6/1 11:15
 * @Version 1.0
 */
public class Singleton2 {
    //私有化构造方法
    private Singleton2(){
    }
    private static Singleton2 singleton;

    public static Singleton2 getInstance(){
        if (singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }

}
