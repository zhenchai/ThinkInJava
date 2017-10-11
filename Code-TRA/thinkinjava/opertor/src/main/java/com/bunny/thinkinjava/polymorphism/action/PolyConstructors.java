package com.bunny.thinkinjava.polymorphism.action;

/**
 * \* Created By Zhen Chai on 2017/9/4.
 * \* Description:构造器内部的多态
 * \* @author zhenchai
 * \* @author zhenchai@foxmail.com
 * \* @version 1.0.0
 * \
 * result：Glyph() before draw()RoundGlyph.draw(). radius = 0Glyph() after draw()RoundGlyph.RoundGlyph().radius = 5
 * 分析：1、执行构造器的顺序是从基类往后一层层执行；
 *       2、注意：在执行Glyph构造器时，draw()方法被RoundGlyph中的draw()覆盖；---构造器的多态
 *       3、Glyph()构造器执行的顺序在RoundGlyph类初始化之前，所以执行第一次的radius值是0，是初始化二进制的零；
 *       ；
 */
public class PolyConstructors {
    public static void main(String[] args) {
        RoundGlyph roundGlyph = new RoundGlyph(5);
    }
}

class Glyph {
    void draw() { System.out.printf("Glyph.draw()"); }
    Glyph() {
        System.out.printf("Glyph() before draw()");
        draw();
        System.out.printf("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int i) {
        radius = i;
        System.out.printf("RoundGlyph.RoundGlyph().radius = " + radius);
    }

    void draw() {
        System.out.printf("RoundGlyph.draw(). radius = " + radius);
    }

}
