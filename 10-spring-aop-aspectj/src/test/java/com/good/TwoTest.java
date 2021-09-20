package com.good;

import com.good.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/14
 */
public class TwoTest {
    @Test
    public void test02(){
        String config="applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy=(SomeService)ac.getBean("someService");
        String result =proxy.doOther("李四",21);
        System.out.println(result);
    }
}
