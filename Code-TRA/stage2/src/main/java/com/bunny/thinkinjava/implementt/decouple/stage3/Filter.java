package com.bunny.thinkinjava.implementt.decouple.stage3;

import com.bunny.thinkinjava.implementt.decouple.stage2.Processor;

/**
 * Created by zhenchai on 2017/9/7.
 * Description:
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 *
 * @see Processor
 */
abstract class Filter implements Processor{
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Waveform process(Object input);
}
