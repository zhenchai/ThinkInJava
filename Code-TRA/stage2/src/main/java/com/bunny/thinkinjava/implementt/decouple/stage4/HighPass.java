package com.bunny.thinkinjava.implementt.decouple.stage4;

import com.bunny.thinkinjava.implementt.decouple.stage3.Waveform;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: HighPass继承Filter
 *
 * @see Filter
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class HighPass extends Filter{

    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Object input) {
        return (Waveform) input;
    }
}
