package com.bunny.thinkinjava.implementt.decouple.stage2;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: 将导出类的name方法抽取出来单独设置一个abstract类
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 *
 * @see Processor
 */
abstract class StringProcessor implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String process(Object input);
}
