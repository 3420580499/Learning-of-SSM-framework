package com.example.exce;

/**
 * @author 小白
 * @create 2021/3/22
 */
public class MyRunTimeException extends RuntimeException{
    public MyRunTimeException() {
        super();
    }

    public MyRunTimeException(String message) {
        super(message);
    }
}
