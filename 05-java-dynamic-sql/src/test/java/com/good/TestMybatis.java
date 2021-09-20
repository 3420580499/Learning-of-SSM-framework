package com.good;


import com.github.pagehelper.PageHelper;
import com.good.dao.StudentDao;
import com.good.entity.Student;
import com.good.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小白
 * @create 2021/2/9
 */
public class TestMybatis {
   @Test
    public void testSelectStudent(){
       SqlSession sqlSession = MybatisUtil.getSqlSession();
       StudentDao dao = sqlSession.getMapper(StudentDao.class);
       List<Student> list  = dao.selectStudent(new Student(null,"张飞","zhangfei@qq.com",20));
       list.forEach(System.out::println);
       sqlSession.close();
   }
   @Test
   public void testSelectStudentTwo(){
      SqlSession sqlSession = MybatisUtil.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> list  = dao.selectStudentTwo(new Student(null,"张飞","zhangfei@qq.com",20));
      list.forEach(System.out::println);
      sqlSession.close();
   }
   @Test
   public void testSelectStudentById(){
      String sql = "select * from student where id in";
      StringBuilder builder = new StringBuilder("(");
      List<Integer> idlist = new ArrayList<>();
      idlist.add(1001);
      idlist.add(1002);
      idlist.add(1003);
      for(Integer id :idlist){
         builder.append(id).append(",");
      }
      //删除指定下标处(此处删除了",")
      builder.deleteCharAt(builder.length()-1);
      builder.append(")");
      sql = sql + builder.toString();
      System.out.println(sql);
   }
   @Test
   public void testSelectForeachOne(){
      SqlSession sqlSession = MybatisUtil.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Integer> idList = new ArrayList<>();
      idList.add(1001);
      idList.add(1002);
      idList.add(1003);
      List<Student> list  = dao.selectForeachOne(idList);
      list.forEach(System.out::println);
      sqlSession.close();
   }
   @Test
   public void testSelectForeachTwo(){
      SqlSession sqlSession = MybatisUtil.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Integer> idList = new ArrayList<>();
      idList.add(1001);
      idList.add(1002);
      idList.add(1003);
      List<Student> list  = dao.selectForeachTwo(idList);
      list.forEach(student -> System.out.println(student));
      sqlSession.close();
   }
   @Test
   public void testSelectForeachThree(){
      SqlSession sqlSession = MybatisUtil.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> stuList = new ArrayList<>();
      stuList.add(new Student (1001,"李四","lisi@qq.com",20));
      stuList.add(new Student (1003,"张飞","zhangfei@qq.com",28));
      List<Student> list  = dao.selectForeachThree(stuList);
      list.forEach(student -> System.out.println(student));
      sqlSession.close();
   }
   @Test
   public void testSelectAllStudent(){
      PageHelper.startPage(2,4);
      SqlSession sqlSession = MybatisUtil.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> list  = dao.selectAllStudent();
      list.forEach(student -> System.out.println(student));
      sqlSession.close();
   }

















}
