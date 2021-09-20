package com.good;

import com.good.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/15
 */
public class ThreeTest {
    @Test
    public void test03(){
        String config="applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy=(SomeService)ac.getBean("someService");
        //相当于String result = proxy.myAround("未知",21);
        String result =proxy.doOther("未知",21);
        System.out.println(result);
    }
}

