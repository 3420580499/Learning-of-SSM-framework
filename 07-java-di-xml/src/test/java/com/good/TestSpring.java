package com.good;

import com.good.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author 小白
 * @create 2021/2/20
 */
public class TestSpring {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)as.getBean("myStudent");
        System.out.println(stu);

    }
    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)as.getBean("myStudentTwo");
        System.out.println(stu);
    }
    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)as.getBean("myStudentThree");
        System.out.println(stu);
    }
    @Test
    public void test04(){
        String config = "applicationContext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        File myFile= (File)as.getBean("myFile");
        System.out.println(myFile.getName());
    }
    @Test
    public void test05(){
        String config = "applicationContext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        Student stu= (Student)as.getBean("myStudentFour");
        System.out.println(stu);
    }
    @Test
    public void test06(){
        String config = "applicationContext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        Student stu= (Student)as.getBean("myStudentFive");
        System.out.println(stu);
    }
    @Test
    public void test07(){
        String config = "all/total.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        Student stu= (Student)as.getBean("myStudent");
        System.out.println(stu);
    }
}
