package com.bunny.thinkinjava.exception;

/**
 * Created by zhenchai on 2017/9/27.
 * Description: 自定义异常
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class CustomException extends Exception {

    private String message;

    public CustomException(String message) {
        super("自定义异常");
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public CustomException setMessage(String message) {
        this.message = message;
        return this;
    }
}
