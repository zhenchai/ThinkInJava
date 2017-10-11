package com.bunny.thinkinjava.innerclass.test;

/**
 * Created by zhenchai on 2017/9/16.
 * Description: 匿名内部类
 * 创建一个继承自父类的匿名内对象，通过new表达式返回的引用被自动向上转型为对父类InnerClass的引用
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class OuterClassWithName {

    public InnerClass getInnerClass(final int num, String str2) {

        return new InnerClass() {
            int number = num + 3;

            public int getNumber() {
                return number;
            }
        };

    }

    public static void main(String[] args) {
        OuterClassWithName outerClassWithName = new OuterClassWithName();
        InnerClass inner = outerClassWithName.getInnerClass(2, "chaizhen");
        System.out.println(inner.getNumber());
    }


}

interface InnerClass {
    int getNumber();
}
