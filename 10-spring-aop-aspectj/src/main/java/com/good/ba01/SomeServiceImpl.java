package com.good.ba01;

/**
 * @author 小白
 * @create 2021/3/12
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //给其增加功能,要求在方法前面输出方法的执行时间
        System.out.println("运行doSome业务方法");
    }
}
