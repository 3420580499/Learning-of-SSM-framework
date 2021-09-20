package com.example;

import com.example.service.impl.BuyGoodsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小白
 * @create 2021/3/22
 */
public class TransactionTest {
    @Test
    public void test01(){
        String config ="applicationcontext.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        BuyGoodsServiceImpl service= (BuyGoodsServiceImpl) as.getBean("goodsService");
        service.buy(1001,10);

    }
}
