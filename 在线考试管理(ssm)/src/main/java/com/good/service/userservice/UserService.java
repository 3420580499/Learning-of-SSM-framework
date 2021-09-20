package com.good.service.userservice;

import com.good.domain.Question;
import com.good.domain.User;

import java.util.List;

/**
 * @author 小白
 * @create 2021/5/3
 */
public interface UserService {
    //调用dao验证登录
    int userLogin(String userName, String passWord);
    //添加用户
    int addUser(User user);
    //查询用户
    List<User> queryUser();
    //删除用户
    int removeUser(Integer userId);
    //试题注册
    int addQuestion(Question question);
    //试题查询
    List<Question> queryQuestion();
}
