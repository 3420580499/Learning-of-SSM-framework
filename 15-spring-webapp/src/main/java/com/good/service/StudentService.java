package com.good.service;

import com.good.entity.Student;

import java.util.List;

/**
 * @author 小白
 * @create 2021/3/20
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudent();
}
