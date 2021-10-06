package com.good;

import com.good.dao.StudentDao;
import com.good.entity.OtherStudent;
import com.good.entity.Student;
import com.good.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

;


/**
 * @author 小白
 * @create 2021/2/9
 */
public class TestMybatis {
    //测试方法,测试功能
    @Test
    public void testSelect() {
        /*
         * 使用mybatis的动态代理机制,使用SqlSession.getMapper(dao接口)
         * getMapper能获取dao接口对应的实现类对象
         * (里面采用了反射机制)
         */
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //调用dao的方法,执行数据库的操作
        List<Student> list = dao.selectStudents();
        list.forEach(stu -> System.out.println(stu));
        //list.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student stu  =new Student(1006,"项羽","xianlgyu@qq.c0m",37);
        int num = dao.insertStudent(stu);
        sqlSession.commit();
        System.out.println(num);
        sqlSession.close();
    }
    @Test
    public void testReturnMap(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<Object,Object> map = dao.returnMap(1001);
        System.out.println(map);
        sqlSession.close();
    }
    @Test
    public void testSelectAllStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> list = dao.selectAllStudent();
        list.forEach(stu -> System.out.println(stu));
        sqlSession.close();
    }
    @Test
    public void testSelectOtherStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<OtherStudent> list = dao.selectOtherStudent();
        list.forEach(otherStudent -> System.out.println(otherStudent));
        sqlSession.close();
    }
    @Test
    public void testSelectOtherStudentTwo(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<OtherStudent> list = dao.selectOtherStudent();
        list.forEach(otherStudent -> System.out.println(otherStudent));
        sqlSession.close();
    }
    @Test
    public void testSelectLikeStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String name = "%张%";
        List<Student> list = dao.selectLikeStudent(name);
        list.forEach(otherStudent -> System.out.println(otherStudent));
        sqlSession.close();
    }
    @Test
    public void testSelectLikeStudentTwo(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String name = "羽";
        List<Student> list = dao.selectLikeStudentTwo(name);
        list.forEach(otherStudent -> System.out.println(otherStudent));
        sqlSession.close();
    }

}
