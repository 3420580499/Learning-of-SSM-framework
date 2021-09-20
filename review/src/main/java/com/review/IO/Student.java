package com.review.IO;

import java.io.Serializable;

/**
 * @author 小白
 * @create 2021/2/24
 */

/**
 * 实现该接口后,java虚拟机会自动生成一个序列化版本号
 */
public class Student implements Serializable {
    //transient表示游离的,不参加序列化
    private transient String name;
    private Integer age;
    //建议将序列化版本号手动写出来,不建议自动生成
    private static final long serialVersionUID=1L;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
