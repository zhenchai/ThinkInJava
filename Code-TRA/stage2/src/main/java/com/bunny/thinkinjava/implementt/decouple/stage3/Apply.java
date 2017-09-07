package com.bunny.thinkinjava.implementt.decouple.stage3;

import com.bunny.thinkinjava.implementt.decouple.stage2.Processor;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: 在不改动之前Apply的基础上，将Processor设计成接口，则可以解决之前Filter无法应用于Apply的缺陷
 *
 * @see Processor
 * @see Filter
 * @see com.bunny.thinkinjava.implementt.decouple.stage1.ClassInherit
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
        //process(new Upcase(), s);
        //process(new Downcase(),s);
        //process(new Splitter(),s);

        Waveform w = new Waveform();
        process(new LowPass(1.0),w);
        process(new HighPass(3.0),w);
        process(new BandPass(1.0,2.0),w);
    }
}


class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    @Override
    public Waveform process(Object input) {
        return (Waveform) input;
    }
}
class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    @Override
    public Waveform process(Object input) {
        return (Waveform) input;
    }
}
class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    @Override
    public Waveform process (Object input){
        return (Waveform) input;
    }
}