package com.lian.object;

import java.util.Objects;

/**
 * ClassName: ObjectTest
 * Package: com.lian.object
 * Description: java.lang包下，任何一个类都直接或间接继承于Object类，所以我们称其为根父类。
 * 故object中的类中的属性以及方法都具有通用性。提供了一个空参构造器。
 *
 *
 * @Author mblian
 * @Create 2023/5/31 14:15
 * @Version 1.0
 */
public class ObjectTest {
    /**
     * 自定义的类在没有重写equals方法时，调用的是object类的，比较的是两个对象的地址是否相同。
     * 对于String、File、Date和包装类都重写了equals方法，实际运行的就是其重写的方法。
     * 对于自定义的类，如果要使用到equals方法，一般都要进行重写。
     * equals 在Object中相当于基本数据类型的 ==
     */

    //高频面试题

    /**
     * == 运算符
     * 1.适用范围：基本数据类型、引用数据类型
     * 2.基本数据类型：判断数据值是否相等。
     * 3.引用数据类型：比较两个引用变量的地址值是否相等。（或比较两个引用是否指向同一个对象实体）
     * equals() 是一个方法.
     * 1.适用范围：基本数据类型，引用数据类型
     * 2.基本数据类型：判断数据值是否相等。
     * 3.引用数据类型：若没重写，则使用object中的equals
     *  若重写了，则使用equals方法，一般比较对象的地址，类型、以及属性
     */
    public static void main(String[] args) {
        User tom = new User("tom", "11");
        User tom1 = new User("tom", "11");
        boolean equals = tom.equals(tom1);
        System.out.println(tom);
        String a = "123";
        String b = "123";
        boolean equals1 = a.equals(b);
        System.out.println(equals1);
    }
}
class User{
    String name;
    String age;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
