package com.good;

import com.good.ba06.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/16
 */
public class SixTest {
    @Test
    public void test05(){
        String config="applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl proxy=(SomeServiceImpl) ac.getBean("someService");
        String result =proxy.doOther("未知",21);
        //目标方法没有接口,使用的是cglib动态代理,spring会自动引用cglib
        //com.good.ba06.SomeServiceImpl$$EnhancerBySpringCGLIB$$31e93f1f
        //System.out.println(proxy.getClass().getName());
        System.out.println(result);
    }
}
