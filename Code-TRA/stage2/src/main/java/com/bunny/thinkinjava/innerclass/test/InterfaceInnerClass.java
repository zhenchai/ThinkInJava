package com.bunny.thinkinjava.innerclass.test;

/**
 * Created by zhenchai on 2017/9/16.
 * Description: 接口内部的类
 * 注意：原本是接口中是不能放置任何代码，但是嵌套类是可以的；
 * 在接口内默认的类是public static
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public interface InterfaceInnerClass {

    void f();

    class ClassInterface implements InterfaceInnerClass {
        @Override
        public void f() {
            System.out.println("接口内部类测试");
        }

        public static void main(String[] args) {
            new ClassInterface().f();
        }
    }
}
