package com.bunny.thinkinjava.enumm.action;

/**
 * \* Created By Zhen Chai on 2017/8/30.
 * \* Description:测试 Coin枚举类
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \
 */
public class TestEnum {
    public static void main(String[] args) {
        /**
         * values()方法是按照其声明的顺序
         * c : 默认调用其toString()方法
         * ordinal()；表示特定常量的声明顺序
         */
        for (Coin c : Coin.values()) {
            System.out.println(c + ", ordinal " + c.ordinal());
        }
    }
}
