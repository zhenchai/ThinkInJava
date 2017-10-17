package com.bunny.thinkinjava.array;

/**
 * Created by zhenchai on 2017/10/17.
 * Description: 数组的复制与clone区别
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class ArrayClone {

    public static void arrayCopyTest() {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    /**
     * clone 基本数据类型
     */
    public static void arrayCloneInt() {
        int array1[] = {1, 2, 3, 4, 5};

        int array2[] = array1.clone();

        System.out.println("the length of array1 is " + array1.length + ";");
        System.out.println("the length of array2 is " + array2.length + ";");

        array2[0] = 6;

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    /**
     * clone 引用对象
     * 克隆的是对象的引用，array1中对数据的更改会影响array2数据的更改
     */
    public static void arrayCloneObject() {

        Person person1 = new Person("zhenchai", 21);
        Person person2 = new Person("fangjiehu", 22);
        Person person3 = new Person("weizhiwan", 23);
        Person array1[] = {person1, person2, person3};

        Person array2[] = array1.clone();

        for (Person person : array2) {
            System.out.println(person);
        }

        array1[0].setName("zhenchai_update");

        for (Person person : array2) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        //arrayCloneInt();
        arrayCloneObject();
    }
}
