package com.good;

import com.good.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/12
 */
public class AspectTest {
    @Test
    public void test01(){
        String config="applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy=(SomeService)ac.getBean("someService");
        //proxy com.sun.proxy.$Proxy8-->jdk的动态代理
        System.out.println("proxy "+proxy.getClass().getName());
        proxy.doSome("李四",21);
    }
}
