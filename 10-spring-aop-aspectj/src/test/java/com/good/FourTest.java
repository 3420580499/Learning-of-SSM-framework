package com.good;

import com.good.ba04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/16
 */
public class FourTest {
    @Test
    public void test04(){
        String config="applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy=(SomeService)ac.getBean("someService");
        String result =proxy.doOther("未知",21);
        System.out.println(result);
    }
}
