package com.bunny.thinkinjava.exception;


/**
 * Created by zhenchai on 2017/9/22.
 * Description: 自定义异常测试
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class ExceptionTest {


    public static void main(String[] args) {
        ExceptionTest arrayListCode = new ExceptionTest();
        arrayListCode.testException();
    }

    public void testException() {
        int a = 0;
        try {
            add(0);
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void add(int a) throws CustomException {
        if (a == 0) {
            throw new CustomException("参数错误");
        }
    }

}
