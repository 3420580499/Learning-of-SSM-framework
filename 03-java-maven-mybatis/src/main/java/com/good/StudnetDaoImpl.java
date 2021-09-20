package com.good;

import com.good.dao.StudentDao;
import com.good.entity.Student;
import com.good.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 小白
 * @create 2021/2/10
 */
//使用传统dao实现接口来重写方法
public class StudnetDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sqlId = "com.good.dao.StudentDao"+"."+"selectStudents";
        List<Student> list = sqlSession.selectList(sqlId);
        sqlSession.close();
        return list;
    }
}
