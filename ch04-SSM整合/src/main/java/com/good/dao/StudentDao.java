package com.good.dao;

import com.good.domain.Student;

import java.util.List;

/**
 * @author 小白
 * @create 2021/4/21
 */
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
