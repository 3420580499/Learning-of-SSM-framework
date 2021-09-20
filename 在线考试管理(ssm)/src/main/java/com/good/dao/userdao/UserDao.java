package com.good.dao.userdao;

import com.good.domain.Question;
import com.good.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 小白
 * @create 2021/5/3
 */
public interface UserDao {
    //验证登录的方法
   int login(@Param("userName") String userName, @Param("passWord") String passWord);

   //添加用户
    int insertUser(User user);

    //查询用户
     List<User> selectUser();

    //删除用户
    int deleteUser(Integer userId);

    //试题注册
    int insertQuestion(Question question);
    //试题查询
    List<Question> findQuestion();
}
