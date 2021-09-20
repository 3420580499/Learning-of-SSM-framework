package com.example.service.impl;

import com.example.dao.GoodsDao;
import com.example.dao.SaleDao;
import com.example.domain.Goods;
import com.example.domain.Sale;
import com.example.exce.MyRunTimeException;
import com.example.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 小白
 * @create 2021/3/22
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }


    /**
     * rollbackFor表示发生指定的异常进行回滚
     * 处理逻辑:1)抛出rollbackFor中指定异常一定会回滚
     *         2)抛出的是运行时异常也会进行回滚
     *
     */
    /*@Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,MyRunTimeException.class
            }

    )*/

    //不写也行(都是默认值,此处适用)
    //使用的是事务控制的默认值,默认的传播行为是REQUIRED,默认的隔离级别是DEFAULT,
    //默认抛出运行时异常就回滚事务
    @Transactional
    @Override
    public void buy(Integer goodsId, int count){
        System.out.println("==buy()方法的开始==");
        //先生成一条购买记录
        Sale sale= new Sale(goodsId,count);
        saleDao.insertSale(sale);

        Goods good = goodsDao.selectGoods(goodsId);
        if(good==null){
            throw new NullPointerException("没有此商品");
        }
        else if(good.getAmount()<count){
            throw new MyRunTimeException("数量不足");
        }
        //然后更新库存
        goodsDao.updateGoods(sale);


        System.out.println("==buy()方法的结束==");
    }
}
