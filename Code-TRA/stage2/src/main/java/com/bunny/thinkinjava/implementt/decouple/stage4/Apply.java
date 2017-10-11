package com.bunny.thinkinjava.implementt.decouple.stage4;

import com.bunny.thinkinjava.implementt.decouple.stage2.Processor;
import com.bunny.thinkinjava.implementt.decouple.stage3.Waveform;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: Apply，Filter不变的情况下，通过使processor接口化，设计Adaptor的方式使Apply应用到Filter
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Apply {

    public static String s = "Disagredment with beliefs is by definition incorrect";
    public static void process(Processor p, Object s){
        System.out.println("Using Processor "+ p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        Waveform w = new Waveform();
        process(new FilterAdapter(new LowPass(1.0)), w);
        process(new FilterAdapter(new HighPass(3.0)), w);
        process(new FilterAdapter(new BandPass(1.0,2.0)), w);
    }
}
