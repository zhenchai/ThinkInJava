package com.bunny.thinkinjava.implementt.decouple.stage4;

import com.bunny.thinkinjava.implementt.decouple.stage2.Processor;
import com.bunny.thinkinjava.implementt.decouple.stage3.Waveform;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: 为保证Filter不修改，需应用到Adaptor适配设计模式
 *
 * @see Filter
 * @see Waveform
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class FilterAdapter implements Processor{

    Filter filter;
    public FilterAdapter (Filter filter){
        this.filter = filter;
    }
    public String name() {
        return filter.name();
    }
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
