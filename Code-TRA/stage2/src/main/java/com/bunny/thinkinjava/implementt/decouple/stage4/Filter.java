package com.bunny.thinkinjava.implementt.decouple.stage4;


import com.bunny.thinkinjava.implementt.decouple.stage3.Waveform;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: stage3中是需要修改Filter，才能将Filter应用到
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
