package com.good;

import com.good.entity.Student;
import com.good.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 小白
 * @create 2021/2/9
 */
public class TestMybatis {
    //测试方法,测试功能
    @Test
    public void testInsert() throws Exception{
        //完成插入操作
        //1.定义mybatis主配置文件的名称,从类路径的根开始(target/classes)
        //String config ="mybatis.xml";
        //2.读取这个config表示的文件
        //InputStream in = Resources.getResourceAsStream(config);
        //3.创建了SqlSessionFactoryBuilder对象
        //SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //4.创建SqlSessionFactory(会话工厂)对象
        //SqlSessionFactory factory = builder.build(in);
        //5.获取SqlSession(会话)对象,从SqlSessionFactory中获取SqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //6.[重要]指定要执行的sql语句的标识.  sql映射文件中的namespace + "." +标签的id值
        String sqlId = "com.good.dao.StudentDao" + "." + "insertStudents" ;
        //7.[重要]执行sql语句,通过sqlId找到语句
        Student student = new Student(1005,"刘备","liubei@qq.com",25);
        int num  = sqlSession.insert(sqlId,student);
        //mybatis默认不是自动提交事务的,而在insert,update,delete后要手工提交事务
        sqlSession.commit();
        //8.输出结果
        System.out.println("执行insert的结果:"+num);
        //9.关闭sqlSession
        sqlSession.close();
    }
}
