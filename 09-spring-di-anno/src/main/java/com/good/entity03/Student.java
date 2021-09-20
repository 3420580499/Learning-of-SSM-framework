package com.good.entity03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 小白
 * @create 2021/3/7
 */
@Component("myStudent")
public class Student {
    @Value("${id}")
    private Integer id;
    @Value("${name}")
    private String name;
    /**
     * 引用类型
     * (@Resource)来自jdk中的注解,spring框架提供了对这个注解的功能支持,可以使用它给引用类型赋值
     *            使用的也是自动注入的原理,支持byName,byType,默认是byName
     * 位置: 1)在属性定义的上面,无需set方法,推荐使用
     *      2)在set方法的上面
     *
     * 注意:如果byName方式使用失败的话,会自动采用byType的方式进行
     * 只想使用byName方式,需要增加一个name属性
     * name的值是bean的id(名称)
     */
    @Resource(name = "mySchool")
    private School school;

    public Student(){}

    public Student(Integer id, String name, School school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school=" + school +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
