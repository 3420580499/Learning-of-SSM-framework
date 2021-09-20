package com.good;

import com.good.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/2/22
 */
public class SpringTest {
    @Test
    public void test01() throws Exception{
        ApplicationContext as = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) as.getBean("myStudent");
        System.out.println(stu);
    }
}
