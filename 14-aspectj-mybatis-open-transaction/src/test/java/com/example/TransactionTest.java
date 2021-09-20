package com.example;

import com.example.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/22
 */
public class TransactionTest {
    //使用aspectj实现事务管理
    @Test
    public void test01(){
        String config ="applicationcontext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        //此处生成的service为代理对象(也是BuyGoodsService的实现类对象),不能强转为BuyGoodsServiceImpl
        BuyGoodsService service= (BuyGoodsService) as.getBean("goodsService");
        service.buy(1005,10);

    }
}
