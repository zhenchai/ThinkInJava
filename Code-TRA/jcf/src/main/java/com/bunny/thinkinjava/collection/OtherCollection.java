package com.bunny.thinkinjava.collection;

import java.util.*;

/**
 * \* Created By Zhen Chai on 2017/10/12.
 * \* Description:批操作
 *      retainAll()， addAll()，clear()都属于批操作
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \
 */
public class OtherCollection {

    /**
     * retainAll()完成 list与list1的交集操作，并且没有使用循环
     * Tip：Arrays.asList可将数组转换成集合
     */
    private void retainAllTest() {
        List<String> list = new ArrayList<String>(Arrays.asList("1 2 3 4 5".split(" ")));
        List<String> list1 = new ArrayList<String>(Arrays.asList("3 4 5".split(" ")));
        Set<String> result = new HashSet<String>(list);
        result.retainAll(list1);
        for (String str : result) {
            System.out.println(str);
        }


    }

    public static void main(String[] args) {
        OtherCollection otherCollection = new OtherCollection();
        otherCollection.retainAllTest();
    }
}
