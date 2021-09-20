package com.good.ba06;

/**
 * @author 小白
 * @create 2021/3/12
 */
public class  SomeServiceImpl {
    public String doOther(String name, Integer age) {
        System.out.println("执行了doOther方法");;
        return "名字: "+name+",年龄: "+age;
    }
}
