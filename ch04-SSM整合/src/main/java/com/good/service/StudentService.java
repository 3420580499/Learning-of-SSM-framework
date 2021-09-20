package com.good.service;

import com.good.domain.Student;

import java.util.List;

/**
 * @author 小白
 * @create 2021/4/21
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudent();
}
