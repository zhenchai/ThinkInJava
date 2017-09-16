package com.bunny.thinkinjava.innerclass.test;

/**
 * Created by zhenchai on 2017/9/16.
 * Description: 静态内部类的Test
 * tip：静态内部类与非静态内部类的区别类似于静态方法、域与非静态方法、域的区别
 * 无需要与外围类创建引用，访问域时不需要创建实例等
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class StaticInnerClass {
    private String sex;
    public static String name = "zhenchai";

    /**
     * 静态内部类
     */
    static class InnerClass1 {
        //静态内部类中可以存在静态变量
        public static String name1 = "zhenchai_static";
        /**
         * 静态内部类中可访问外围类的静态变量，不可访问非静态变量
         */
        public void display() {
            System.out.println("OutClass name :" + name);
        }
    }

    /**
     * 非静态内部类
     */
    class InnerClass2 {
        /**
         * 非静态内部类中不可以存在静态成员
         */
        public String name2 = "zhenchai_nostatic";

        /**
         * 非静态内部类中可以调用外围类的任何成员
         */
        public void display() {
            System.out.println("OutClass name :" + name);
        }
    }

    /**
     * 外围类方法
     */
    public void display() {
        //外围类访问静态内部类的静态成员，无需创建外围类
        System.out.println(InnerClass1.name1);
        /** 静态内部类，不需要创建外围类，可以直接创建实例进行调用*/
        new InnerClass1().display();

        /** 非静态内部类的创建必须需要依赖外围类StaticInnerClass*/
        StaticInnerClass.InnerClass2 innerClass2 = new StaticInnerClass().new InnerClass2();
        /** 访问非静态内部类的成员先创建非静态内部类的实例*/
        System.out.println(innerClass2.name2);
    }

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.display();
    }
}
