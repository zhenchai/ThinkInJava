package com.bunny.java.proxy.dynamic;

/**
 * Created by zhenchai on 2017/11/15.
 * Description:
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class RealSubject implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("RealSubject's request()....");
    }
}
