package com.good.service.impl;

import com.good.dao.UserDao;
import com.good.entity.User;
import com.good.service.UserService;

/**
 * @author 小白
 * @create 2021/2/21
 */
public class UserServiceImpl implements UserService {
    //这样写代码不灵活
    //private UserDao dao = new UserDaoImpl();
    //private UserDao dao = new OracleDaoImpl();
    //依靠set注入来给dao赋值
    private UserDao dao = null;
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(User user) {
        dao.insert(user);
    }
}
