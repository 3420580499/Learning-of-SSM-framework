package com.good.service.impl;

import com.good.dao.StudentDao;
import com.good.entity.Student;
import com.good.service.StudentService;

import java.util.List;

/**
 * @author 小白
 * @create 2021/3/20
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao ){
        this.studentDao=studentDao;
    }
    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudent() {
        return studentDao.selectStudents();
    }
}
