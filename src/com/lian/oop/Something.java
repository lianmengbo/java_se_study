package com.lian.oop;

/**
 * ClassName: Something
 * Package: com.lian.oop
 * Description:
 *
 * @Author mblian
 * @Create 2023/6/1 16:20
 * @Version 1.0
 */
public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }
    public void addOne(final Other o) {
        // o = new Other();
        o.i++;
        System.out.println(o.i);
    }
}
class Other {
    public int i;
}
