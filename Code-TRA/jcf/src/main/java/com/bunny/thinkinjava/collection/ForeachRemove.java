package com.bunny.thinkinjava.collection;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhenchai on 2017/9/29.
 * Description: 测试for each的remove
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class ForeachRemove {

    private static void testIterator() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("1".equals(item)) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }

    /**
     * 不能使用foreach方式进行remove操作
     */
    private static void testForeach() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        for (String item : list) {
            if ("1".equals(item))
                list.remove(item);
        }

        System.out.println(list);
    }


    public static void main(String[] args) {
        ForeachRemove.testForeach();
        ForeachRemove.testIterator();
    }
}
