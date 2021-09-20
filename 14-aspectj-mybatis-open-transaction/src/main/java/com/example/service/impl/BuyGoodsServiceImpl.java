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

    //统一定义方法的规则
    public void addSale(){}
    public void addGoods(){}

    public void removeSale(){}
    public void removeGoods(){}

    public void modifySale(){}
    public void modifyGoods(){}

    public void querySale(){}
    public void searchSale(){}
}
