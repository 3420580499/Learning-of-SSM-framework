package com.good.exception;

/**
 * @author 小白
 * @create 2021/4/25
 */
public class AgeException  extends UserException{
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
