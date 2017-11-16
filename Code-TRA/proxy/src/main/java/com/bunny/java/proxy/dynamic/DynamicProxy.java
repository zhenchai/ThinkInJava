package com.bunny.java.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhenchai on 2017/11/15.
 * Description:
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class DynamicProxy implements InvocationHandler {

    Object object = null;

    public DynamicProxy(Object obj) {
        this.object = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        return result;
    }
}
