package com.bunny.thinkinjava.innerclass.test;

/**
 * Created by zhenchai on 2017/9/16.
 * Description: 匿名内部类的正常版，省略版见OuterClassWithName
 * @see OuterClassWithName
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class OuterClassWithName_normal {

    public InnerClass getInnerClass(final int num, String str2) {
        return new InnerClassImpl(num);
    }

    class InnerClassImpl implements InnerClass {
        int number = 0;

        public InnerClassImpl(int num){
            number = num + 3;
        }

        @Override
        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        OuterClassWithName_normal outerClassWithName_normal = new OuterClassWithName_normal();
        InnerClass innerClass = outerClassWithName_normal.getInnerClass(2, "chaizhen");
        System.out.println(innerClass.getNumber());
    }

}
