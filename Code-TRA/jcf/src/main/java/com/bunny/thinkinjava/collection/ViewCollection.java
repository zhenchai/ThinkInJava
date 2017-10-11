package com.bunny.thinkinjava.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * \* Created By Zhen Chai on 2017/10/12.
 * \* Description:集合框架中的视图与包装器
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \
 */
public class ViewCollection {

    /**
     * Arrays.asList()方法返回的是基于底层的List视图，不能对其修改
     * 可查看Arrays.asList()的源码，返回的List接口的实现类中无add，remove方法
     */
    private void arraysAsLit() {
        List<String> names = Arrays.asList("Amy", "Bob", "Carl");
        System.out.println("size of names is " + names.size() + ", " +
                "the first element hashCode is " + names.get(0).hashCode() + ", " +
                "the second element hashCode is " + names.get(1).hashCode());

        //names.add("123"); //names是视图，不能对其修改，会显示UnsupportedOperationException
    }


    /**
     * settings也是视图，无法使用add()方法
     * Collections.nCopies只保存一份"zhenchai"对象，settings是该唯一对象的100份视图
     */
    private void nCopiesTest() {
        List<String> settings = Collections.nCopies(100, "zhenchai");
        System.out.println("size of settings is " + settings.size() + ", " +
                "the first element hashCode is " + settings.get(0).hashCode() + ", " +
                "the second element hashCode is " + settings.get(1).hashCode());

        System.out.println(settings.get(0) == settings.get(1));
        //settings.add("123"); //不能对其修改，会显示UnsupportedOperationException
    }

    public static void main(String[] args) {
        ViewCollection viewCollection = new ViewCollection();
        viewCollection.arraysAsLit();
        viewCollection.nCopiesTest();

        System.out.println(new String("11") == new String("11"));
    }

}
