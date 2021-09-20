package com.good.main;

import com.good.handler.MyInvocationHandler;
import com.good.impl.UserServiceImpl;
import com.good.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 小白
 * @create 2021/3/8
 */
public class MyApp {
    public static void main(String[] args) {
        UserService target = new UserServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(target);
        UserService service=(UserService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        service.doSome();
    }
}
