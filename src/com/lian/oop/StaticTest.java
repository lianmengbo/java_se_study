package com.lian.oop;

/**
 * ClassName: StaticTest
 * Package: com.lian.oop
 * Description:笔试题：如下程序执行会不会报错
 *
 * 答案：不会
 *
 * @Author mblian
 * @Create 2023/5/31 17:49
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Demo test = null;
        test.hello();
    }
}
class Demo{
    public static void hello(){
        System.out.println("hello!");
    }
}