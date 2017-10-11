package com.bunny.thinkinjava.implementt.decouple.stage4;

import com.bunny.thinkinjava.implementt.decouple.stage3.Waveform;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: BandPass继承Filter
 *
 * @see Filter
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class BandPass extends Filter{

    double lowCutoff,highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Object input) {
        return (Waveform) input;
    }

}
