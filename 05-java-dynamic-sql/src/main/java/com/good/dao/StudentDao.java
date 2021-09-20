package com.good.dao;

import com.good.entity.Student;

import java.util.List;

/**
 * @author 小白
 * @create 2021/2/8
 */
//接口操作student表
public interface StudentDao {
    //使用动态sql语句返回结果
    List<Student> selectStudent(Student student);
    List<Student> selectStudentTwo(Student student);

    //使用foreach标签
    List<Student> selectForeachOne(List<Integer> idList);
    List<Student> selectForeachTwo(List<Integer> idList);
    List<Student> selectForeachThree(List<Student> stuList);

    //使用PageHelper分页数据
    List<Student> selectAllStudent();

}




















