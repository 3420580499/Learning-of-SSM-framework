package com.good.handler;

import com.good.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author 小白
 * @create 2021/3/8
 */
public class MyInvocationHandler implements InvocationHandler {
    private UserService target;

    public MyInvocationHandler(UserService target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("开始执行方法的时间"+new Date());
        result = method.invoke(target,args);
        System.out.println("提交事务");
        return result;
    }
}
