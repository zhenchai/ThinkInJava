package com.bunny.thinkinjava.designpattern.adapter.class_adapter;


/**
 * Created by zhenchai on 2017/9/8.
 * Description: 客户端实现类；
 * 通过Adapter使接口不一致的原先实现完的类Adaptee能够提供给客户以统一接口；
 * @see
 * @see
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class MyClass {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
