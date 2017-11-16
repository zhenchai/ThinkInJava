package com.bunny.java.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zhenchai on 2017/11/15.
 * Description:
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Client {

    public static void main(String[] args) {
        AbstractSubject realSubject = new RealSubject();

        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();

        InvocationHandler handler = new DynamicProxy(realSubject);
        //获得代理的实例
        AbstractSubject proxy = (AbstractSubject) Proxy.newProxyInstance(loader, interfaces, handler);

        proxy.request();
        //打印代理的名称
        System.out.println(proxy.getClass().getName());
    }
}
