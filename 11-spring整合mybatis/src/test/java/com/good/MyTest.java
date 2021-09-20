package com.good;

import com.good.dao.StudentDao;
import com.good.entity.Student;
import com.good.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 小白
 * @create 2021/3/21
 */
public class MyTest {
    @Test
    public void test01(){
        String config = "applicationcontext.xml";
        ApplicationContext as =new ClassPathXmlApplicationContext(config);
        String  [] names= as.getBeanDefinitionNames();
        for(String name :names ){
            System.out.println("spring容器创建的对象:"+name+"|"+as.getBean(name).getClass().getName());
        }
    }

    @Test
    //测试dao对象
    public void test02(){
        String config = "applicationcontext.xml";
        ApplicationContext as =new ClassPathXmlApplicationContext(config);
        StudentDao dao = (StudentDao)as.getBean("studentDao");
        Student student= new Student (1007,"吕布","lvbu@qq.com",31);
        int num = dao.insertStudent(student);
        System.out.println(num);
    }
    @Test
    //测试service对象
    public void test03(){
        String config = "applicationcontext.xml";
        ApplicationContext as =new ClassPathXmlApplicationContext(config);
        StudentService service=(StudentService)as.getBean("studentService");
        Student stu = new Student (1009,"小白","bai.com",20);
        int result =service.addStudent(stu);
        //spring整合mybatis为自动提交事务的,无需sqlSession.commit();
        System.out.println(result);
    }
    @Test
    //测试查询
    public void test04(){
        String config = "applicationcontext.xml";
        ApplicationContext as =new ClassPathXmlApplicationContext(config);
        StudentService service=(StudentService)as.getBean("studentService");
        List<Student> list =service.queryStudent();
        list.forEach(student -> System.out.println(student));

    }
}
