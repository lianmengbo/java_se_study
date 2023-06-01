package com.lian.oop;

/**
 * ClassName: BlockTest
 * Package: com.lian.oop
 * Description:
 *
 * @Author mblian
 * @Create 2023/6/1 14:51
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        person person
                = new person();
        person.eat();

    }


}
class person{
    String name;
    String age;

    public void eat(){
        System.out.println("吃饭");
    }
    //代码块---只能使用static进行修饰

    //非静态代码块
    {
        System.out.println("非静态代码块");
    }
    //静态代码块
    static {
        System.out.println("静态代码块");
    }
}