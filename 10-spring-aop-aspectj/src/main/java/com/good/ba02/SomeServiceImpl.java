package com.good.ba02;

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

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("执行了doOther方法");;
        return "名字: "+name+",年龄: "+age;
    }
}
