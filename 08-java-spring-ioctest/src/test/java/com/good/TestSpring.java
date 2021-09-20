package com.good;

import com.good.entity.User;
import com.good.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/2/20
 */
public class TestSpring {
   @Test
    public void test01(){
       ApplicationContext as = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService service = (UserService) as.getBean("myuserservice");
       service.addUser(new User("张飞",32));
    }











}
