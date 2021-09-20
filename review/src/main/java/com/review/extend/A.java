package com.review.extend;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class A {
    private String name;
    private int age;

    public A(){
        System.out.println("父类无参构造");
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String show (){
        return name+age;
    }
}
