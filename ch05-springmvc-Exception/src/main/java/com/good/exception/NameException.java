package com.good.exception;

/**
 * @author 小白
 * @create 2021/4/25
 */
public class NameException extends UserException{
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
