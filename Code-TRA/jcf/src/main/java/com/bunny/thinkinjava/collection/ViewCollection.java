package com.bunny.thinkinjava.collection;

import java.util.ArrayList;
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

    /**
     * subList()可建立子范围视图，该视图是可操作的
     */
    private void subViewTest() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        for (String str : list) {
            System.out.print(str + ", ");
        }
        System.out.println("-----------");

        List<String> group1 = list.subList(1, 3);

        group1.clear();
        group1.add("--");
        for (String str : list) {
            System.out.print(str + ", ");
        }
    }

    public static void main(String[] args) {
        ViewCollection viewCollection = new ViewCollection();
        //viewCollection.arraysAsLit();
        //viewCollection.nCopiesTest();

        viewCollection.subViewTest();
        //System.out.println(new String("11") == new String("11"));
    }

}
