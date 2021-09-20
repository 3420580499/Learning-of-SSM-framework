package com.good.controller;

import com.good.domain.Student;
import com.good.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小白
 * @create 2021/4/21
 */
@Controller
public class MeController {

    @Resource
    private StudentService service;

    @RequestMapping("/add.do")
    public ModelAndView addStu(Student student){
        String tips ="添加失败";
        ModelAndView mv = new ModelAndView();
        int num=service.addStudent(student);
        if(num>0){
            tips="学生"+student.getName()+"添加成功";
        }
        mv.addObject("tip",tips);
        mv.setViewName("result");
        return mv;
    }

    @ResponseBody
    @RequestMapping("/find.do")
    public List<Student> selectStu(){
        List<Student> lists = service.findStudent();
        return lists;
    }
}
