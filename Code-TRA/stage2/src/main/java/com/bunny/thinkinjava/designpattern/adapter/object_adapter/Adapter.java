package com.bunny.thinkinjava.designpattern.adapter.object_adapter;

/**
 * Created by zhenchai on 2017/9/8.
 * Description: 适配器类，对象适配器
 * 适配器类负责包装 适配者类Adaptee，使其封装成客户所期望的接口Target
 * 适配器模式：将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作；
 * @see Adaptee
 * @see Target
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Adapter implements Target{

    private Adaptee mAdaptee;

    // 传递原先的实现类，使其转换成现有的Adapter类
    public Adapter(Adaptee adaptee) {
        this.mAdaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        mAdaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOpertion2");
    }
}
