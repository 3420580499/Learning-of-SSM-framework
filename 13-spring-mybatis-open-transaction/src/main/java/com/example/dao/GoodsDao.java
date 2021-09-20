package com.example.dao;

import com.example.domain.Goods;
import com.example.domain.Sale;

/**
 * @author 小白
 * @create 2021/3/22
 */
public interface GoodsDao {
    int updateGoods(Sale sale);
    Goods selectGoods(Integer id);
}
