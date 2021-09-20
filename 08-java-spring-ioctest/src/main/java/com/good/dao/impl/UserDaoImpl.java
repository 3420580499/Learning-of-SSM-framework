package com.good.dao.impl;

import com.good.dao.UserDao;
import com.good.entity.User;

/**
 * @author 小白
 * @create 2021/2/21
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void insert(User user) {
        System.out.println("将user插入到数据库中");
    }
}
