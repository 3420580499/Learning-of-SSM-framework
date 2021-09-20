package com.good.service.userservice.impl;

import com.good.dao.userdao.UserDao;
import com.good.domain.Question;
import com.good.domain.User;
import com.good.service.userservice.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小白
 * @create 2021/5/3
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao dao;

    @Override
    public int userLogin(String userName, String passWord) {
        return dao.login(userName,passWord);
    }

    @Override
    public int addUser(User user) {
        return dao.insertUser(user);
    }

    @Override
    public List<User> queryUser() {
        return dao.selectUser();
    }

    @Override
    public int removeUser(Integer userId) {
        return dao.deleteUser( userId);
    }

    @Override
    public int addQuestion(Question question) {
        return dao.insertQuestion(question);
    }

    @Override
    public List<Question> queryQuestion() {
        return dao.findQuestion();
    }
}
