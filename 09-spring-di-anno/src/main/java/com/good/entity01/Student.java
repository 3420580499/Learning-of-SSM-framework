package com.good.entity01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 小白
 * @create 2021/3/6
 */
@Component("myStudent")
public class Student {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    /**
     * (@Autowired):spring框架提供的注解,实现引用类型的赋值
     * spring中通过注解个引用类型赋值,使用的是自动注入原理,支持byName和byType
     * (@Autowired):默认使用的是byType自动注入
     *
     * 位置: 1)在属性定义的上面,无需set方法,推荐使用
     *      2)在set方法的上面
     *
     * 该注解的属性:required,是一个boolean类型的,默认true(@Autowired(required = true))
     *           required=true:表示引用类型赋值失败,程序报错,并终止执行
     *           required=false:引用类型如果赋值失败,程序正常执行,引用类型是null
     *
     * 如果要使用byName的方式,需要做的是:
     * 1.在属性上面加入@Autowired
     * 2.在属性上面加入@Qualifier(value="bean的id"):表示使用指定名称的bean完成赋值(无先后顺序)
     */

    /*@Autowired
    @Qualifier("mySchool")*/
    @Autowired
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
