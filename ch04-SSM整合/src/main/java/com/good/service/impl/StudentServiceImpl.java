package com.good.service.impl;

import com.good.dao.StudentDao;
import com.good.domain.Student;
import com.good.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小白
 * @create 2021/4/21
 */
//spring中创建对象的注解(有四种,比如@Component)
@Service
public class StudentServiceImpl implements StudentService {

    //给引用对类型自动注入@Resource(默认采用byName)和@Autowired
    @Resource
    private StudentDao dao;

    @Override
    public int addStudent(Student student) {
        return dao.insertStudent(student);
    }

    @Override
    public List<Student> findStudent() {
        return dao.selectStudent();
    }
}
