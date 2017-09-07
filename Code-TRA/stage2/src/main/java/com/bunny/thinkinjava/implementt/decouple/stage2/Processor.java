package com.bunny.thinkinjava.implementt.decouple.stage2;

import com.bunny.thinkinjava.implementt.decouple.stage1.ClassInherit;
import com.bunny.thinkinjava.implementt.decouple.stage1.Waveform;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: 将Processor设计成接口，将 ClassInherit.process与Process 之间的耦合度降低；复用其代码
 *
 * @see ClassInherit
 * @see Waveform
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public interface Processor {
    String name();
    Object process(Object input);
}
