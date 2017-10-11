package com.bunny.thinkinjava.implementt.decouple.stage1;


/**
 * Created by zhenchai on 2017/9/7.
 * Description: 给出个例子，以下例子中就不能服用ClassInherit的策略设计模式；
 * 缺点：ClassInherit.process()方法中传入的是Processor类，无法复用使用Filter类；
 *     再有Filter类与Process类的process方法签名是不一样的，Filter无法继承process类；
 * 解决方案：将Processor改成接口；
 * @see ClassInherit
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

class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public  Waveform process(Waveform input) {
        return input;
    }
}

class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
}