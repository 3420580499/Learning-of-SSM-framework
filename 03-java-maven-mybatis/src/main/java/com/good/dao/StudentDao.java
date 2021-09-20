package com.good.dao;

import com.good.entity.Student;

import java.util.List;

/**
 * @author 小白
 * @create 2021/2/8
 */
//接口操作student表
public interface StudentDao {
    //查询Student表中所有数据
    //加上default给予默认实现
    default List<Student> selectStudents(){
        return null;
    };
    //插入方法
    //参数:student,表示要插入到数据库的数据
    //返回值:int,表示执行insert操作后的影响数据库的行数
    default int  insertStudents(Student student){
        return -1;
    };
}




















