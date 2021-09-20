package com.good.dao;

import com.good.entity.Student;

import java.util.List;

/**
 * @author 小白
 * @create 2021/3/20
 */
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
