package com.bunny.thinkinjava.implementt.decouple.stage3;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: Filter所需要的类
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform" + id;
    }
}
