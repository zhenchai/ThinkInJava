package com.bunny.thinkinjava.polymorphism.action;

/**
 * \* Created By Zhen Chai on 2017/9/4.
 * \* Description:向下转型，运行时类型识别
 *    注意：向上转型后，尽管可以使用通用的基类来调用已覆盖的导出类的方法，当时无法调用到导出类的其余新方法，
 *          解决方式：进行强制性向下转型；
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
        //x[0].v();  //error：找不到方法v();
        //x[1].u(); //error：找不到方法v();  因为目前x[1]表示的是Useful，无法调用MoreUseful之中额外的方法；

        //((MoreUseful)x[0]).u(); //error：ClassCastException
        ((MoreUseful)x[1]).u();   //通过强制转型，向下转型，将x[1]强转成MoreUseful即可使用；
    }
}

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}
