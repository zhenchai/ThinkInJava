package com.bunny.thinkinjava.extendss.action;

/**
 * \* Created By Zhen Chai on 2017/8/31.
 * \* Description:子类，基类构造器的执行顺序
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \result: 执行子类构造器初始化之前，会从基类开始向外一层层执行构造器进行初始化操作；
 */
public class ExtendsClass {
    ExtendsClass(){
        System.out.println("初始化ExendsClass");
    }
}

class ChildExtendsClass extends ExtendsClass {
    ChildExtendsClass() {
        System.out.println("初始化ChildExtendsClass");
    }
}

class ChildChildExtendsClass extends ChildExtendsClass {
    ChildChildExtendsClass() {
        System.out.println("初始化ChildChildExtendsClass");
    }

    public static void main(String[] args) {
        new ChildChildExtendsClass();

    }
}


