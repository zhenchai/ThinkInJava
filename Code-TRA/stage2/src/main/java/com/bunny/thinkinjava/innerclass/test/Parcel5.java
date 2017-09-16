package com.bunny.thinkinjava.innerclass.test;



/**
 * Created by zhenchai on 2017/9/14.
 * Description: 局部内部类，内部类定义在方法里
 * 应用场景：对于解决复杂的问题，想创建一个类，但又不希望这个类是公共可用的；
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Parcel5 {

    public Destionation destionation(String str) {

        class PDestionation implements Destionation {  //PDestionation类是 destionation()方法的一部分，在该方法外无法使用该内部类
            private String label;
            private PDestionation(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }

        return new PDestionation(str);  //向上转型，PDestionation的基类是Destionation
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destionation destionation = parcel5.destionation("chaizhen");
    }

}
