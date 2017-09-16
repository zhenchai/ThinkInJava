package com.bunny.thinkinjava.innerclass.test;

/**
 * Created by zhenchai on 2017/9/16.
 * Description: 局部内部类，定义在作用域内
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class Parcel6 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip { // TrackingSlip定义在if中的内部类
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("chaizhen");
            String string = ts.getSlip();
            System.out.println(string);
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
