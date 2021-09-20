package com.good.impl;

import com.good.service.SomeService;

/**
 * @author 小白
 * @create 2021/2/16
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl中的doSome方法");
    }
}
