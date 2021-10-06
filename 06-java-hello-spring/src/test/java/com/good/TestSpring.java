package com.good;

import com.good.impl.SomeServiceImpl;
import com.good.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/2/16
 */
public class TestSpring {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    /**
     * spring默认创建对象的时间:在创建spring的容器时,会创建配置文件中的所有的对象
     * spring创建对象:默认使用无参构造方法
     */
    @Test
    public void test02(){
        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象,  ApplicationContext
        //ApplicationContext就是表示spring容器,通过容器获取对象了
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext as = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象,你要调用对象的方法
        //getBean("配置文件的id值")
       // SomeService impl = (SomeServiceImpl)as.getBean("someService");
        SomeService impl = (SomeService)as.getBean("someService");
        //使用spring创建好的对象
        impl.doSome();
    }
    @Test
    public void test03(){
        Object someService = (Object)new SomeServiceImpl();
        SomeServiceImpl impl = (SomeServiceImpl)someService;
        impl.doSome();

    }
    /**
     * 获取spring容器中java对象的信息
     */
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        //使用spring中提供的方法,获取容器中定义的对象的数量
        int num = as.getBeanDefinitionCount();
        System.out.println(num);
        //容器中每个定义的对象的名称
        String names [] = as.getBeanDefinitionNames();
        for(String name :names){
            System.out.println(name);
        }
    }
    @Test
    public void test05(){
        String config = "beans.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        //使用getBean()
        Date mydate = (Date)as.getBean("mydate");
        System.out.println(mydate);
    }
    @Test
    public void test06(){
        Integer num []={8,4,2,1,23,344,12};
        Date open = new Date();
        System.out.println(Arrays.stream(num).reduce(0, Integer::sum));
        Date end= new Date();
        System.out.println(-open.getTime()+end.getTime());

    }
    @Test
    public void test07(){
       /* String [] name ={"s","d","d"};
        Arrays.stream(name).forEach(System.out::println);*/
        int num []={8,4,2,1,23,344,12};
        Scanner scanner = new Scanner(System.in);
        int i =scanner.nextInt();
        boolean boo = false;
        for(int n :num){
            if(n==i){
                boo=true;
            }
        }
        System.out.println(boo);

    }
}
