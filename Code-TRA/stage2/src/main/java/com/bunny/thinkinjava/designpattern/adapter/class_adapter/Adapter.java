package com.bunny.thinkinjava.designpattern.adapter.class_adapter;


/**
 * Created by zhenchai on 2017/9/8.
 * Description: 适配器类，类适配器
 *
 * 适配器模式：将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作；
 * @see Adaptee
 * @see Target
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOpertion2");
    }
}
