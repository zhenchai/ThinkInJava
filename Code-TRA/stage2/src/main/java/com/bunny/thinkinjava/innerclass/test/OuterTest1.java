package com.bunny.thinkinjava.innerclass.test;


/**
 * Created by zhenchai on 2017/9/14.
 * Description: 内部类：创建内部类
 * 内部类可访问外部类中的属性，即使是private；
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class OuterTest1 {

    private String name = "zhen chai";

    class InnerClass1 {
        int i;
        InnerClass1(int i) {
            this.i = i;
        }
        public void f1() {
            System.out.println("姓名："+ name + " 年龄："+ this.i);
        }
    }

    public InnerClass1 getInnerClass1() {
        return new InnerClass1(27);
    }

    public static void main(String[] args) {
        OuterTest1 outerTest1 = new OuterTest1();
        outerTest1.getInnerClass1().f1();
    }

}
