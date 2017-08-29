package com.bunny.thinkinjava.initial.action;
/**
 * \* Created By Zhen Chai on 2017/8/30.
 * \* Description:静态数据的初始化
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \
 * output：Bowl(1)Bowl(2)Table()f1(1)Bowl(4)Bowl(5)Bowl(3)Cupboard()f1(2)Creating new Cupboard() in mianBowl(3)Cupboard()f1(2)Creating new Cupboard() in mianBowl(3)Cupboard()f1(2)f2(1)f3(1)
 *  分析：初始化的顺序是先静态对象，而后是“非静态”对象。例子中药执行main()方法，必须先加载StaticInitialization类，
 *  然后其静态域table和cupboard被初始化；所以导致Table, Cupboard类被加载，进而其静态域首先被初始化；
 *  1，静态化域只在Class对象首次加载的时候进行一次；
 *
 *
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.printf("Creating new Cupboard() in mian");
        new Cupboard();
        System.out.printf("Creating new Cupboard() in mian");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}


class Bowl {
    Bowl(int marker) {
        System.out.printf("Bowl("+marker+")");
    }
    void f1(int marker) {
        System.out.printf("f1("+marker+")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.printf("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        System.out.printf("f2("+marker+")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.printf("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.printf("f3("+marker+")");
    }
    static Bowl bowl5 = new Bowl(5);
}