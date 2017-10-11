package com.bunny.thinkinjava.implementt.decouple.stage1;

import java.util.Arrays;

/**
 * Created by zhenchai on 2017/9/6.
 * Description: 策略设计模式，通过类继承; stage1
 * 该类中给 ClassInherit.process 传递不同的实例（参数是Processor，实例都继承了Processor），则表现不同的行为；这就是策略设计模式
 * 缺点：ClassInherit.process()与Process之间的耦合性太紧了！
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class ClassInherit {

    public static String s = "Disagredment with beliefs is by definition incorrect";
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}


class Upcase extends Processor {
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}


