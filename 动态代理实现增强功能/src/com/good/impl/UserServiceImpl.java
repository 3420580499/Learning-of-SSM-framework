package com.good.impl;

import com.good.service.UserService;

/**
 * @author 小白
 * @create 2021/3/8
 */
public class UserServiceImpl implements UserService {
    @Override
    public void doSome() {
        System.out.println("执行doSome方法");
    }

    @Override
    public void doOther() {
        System.out.println("执行doOther方法");
    }
}
