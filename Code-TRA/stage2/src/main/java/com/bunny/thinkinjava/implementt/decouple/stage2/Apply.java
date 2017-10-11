package com.bunny.thinkinjava.implementt.decouple.stage2;

import com.bunny.thinkinjava.implementt.decouple.stage1.ClassInherit;

import java.util.Arrays;

/**
 * Created by zhenchai on 2017/9/7.
 * Description: 通过将Processor设计成接口，可以复用ClassInherit中的process代码；
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 *
 * @see ClassInherit
 */
public class Apply {
    public static String s = "Disagredment with beliefs is by definition incorrect";
    public static void process(Processor p, Object s){
        System.out.println("Using Processor "+ p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}

class Upcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Splitter extends StringProcessor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}