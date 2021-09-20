package com.good.controller;

import com.good.domain.Question;
import com.good.domain.User;
import com.good.service.userservice.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小白
 * @create 2021/5/3
 */
@Controller
public class MyController {

    @Resource
    private UserService service;

    //开始进行登录验证
    @RequestMapping(value = "/login.do")
    public ModelAndView doLogin(String userName, String  passWord){
        ModelAndView mv = new ModelAndView();
        int num=0;
        num=service.userLogin(userName,passWord);
        if(num==0){
            mv.setViewName("login_error");
        }else{
            mv.setViewName("redirect:/index.html");
        }
        return mv;
    }

    //添加用户
    @RequestMapping(value = "/userAdd.do")
    public ModelAndView doAdd(User user){
        ModelAndView mv = new ModelAndView();
        int result=0;
        result=service.addUser(user);
        if(result==1){
            mv.addObject("message","用户添加成功");
        }else{
            mv.addObject("message","用户添加失败");
        }
        mv.setViewName("info");
        return mv;
    }

    //查询用户
    @ResponseBody
    @RequestMapping(value = "/userquery.do")
    public List<User> doSelect(){
        List<User> list=service.queryUser();
        return list;
    }
    //删除用户
    @RequestMapping(value = "/userdelete.do")
    public ModelAndView doDelete(Integer userId){
        ModelAndView mv = new ModelAndView();
       int result = 0;
       result=service.removeUser(userId);
       if(result==0){
           mv.addObject("message","用户删除失败");
       }else{
           mv.addObject("message","用户删除成功");
       }
       mv.setViewName("info");
       return mv;
    }
    //试题注册
    @RequestMapping("/questionadd.do")
    public ModelAndView doQuestionAdd(Question question){
        ModelAndView mv = new ModelAndView();
        int result =0;
        result =service.addQuestion(question);
        if(result == 1){
            mv.addObject("message","试题注册成功");
        }else{
            mv.addObject("message","试题注册失败");
        }
        mv.setViewName("info");
        return mv;
    }
    //试题查询
    @ResponseBody
    @RequestMapping("/questionfind.do")
    public List<Question> doQuestionAdd(){
       List<Question> questionList =service.queryQuestion();
       return questionList;

    }
}
