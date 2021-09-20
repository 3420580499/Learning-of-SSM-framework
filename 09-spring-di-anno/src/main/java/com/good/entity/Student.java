package com.good.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 小白
 * @create 2021/2/22
 */

/**
 * (@Component):创建对象的,等同于<bean>的功能
 *    属性:value就是对象的名称,也就是bean的id值,
 *        value的值是唯一的,创建的对象在整个spring容器中就一个
 *    位置:在类的上面
 *
 * (@Component(value = "myStudent"))等同于
 *  <bean id="myStudent" class="com.good.entity.Student" />
 *
 * spring中和@Component功能一致,创建对象的注解还有:
 * 1.@Repository(用于持久层类的上面):放在dao的实现类上面,
 *              表示创建dao对象,dao对象能访问数据库的
 * 2.@Service(用于业务层类的上面):放在service的实现类上面,
 *              创建service对象,service对象是做业务处理的,可以有事务等功能
 * 3.@Controller(用于控制器的上面):放在控制器(处理器)类的上面,创建控制器对象的,
 *               控制器对象,能够接收用户提交的参数,显示请求的处理结果
 *
 * 以上三个注解使用的语法与@Component是一样的,都能创建对象,但是这三个注解还有额外的功能
 * --> @Repository,@Service,@Controller是个项目的对象分层的 <--
 */

//省略value
@Component("myStudent")

//使用value属性,指定对象名称
//@Component(value = "myStudent")

//不指定对象名称,有spring提供默认名称:类名的首字母小写
//@Component
public class Student {

    @Value("关羽")
    private String name;

    @Value(value = "34")
    private Integer age;

    public Student(){
        System.out.println("调用了无参构造");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("ppdasojgig");
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
/**
 * (@value): 简单类型的属性赋值
 *    属性: value是String类型的,表示简单类型的属性值
 *    位置: 1.在属性定义的上面,无需set方法,推荐使用
 *         2.在set方法上面(会调用set方法)
 */