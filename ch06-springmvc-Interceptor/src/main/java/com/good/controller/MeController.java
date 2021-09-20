package com.good.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 小白
 * @create 2021/4/21
 */
@Controller
public class MeController {

    @RequestMapping("/add.do")
    public ModelAndView addStu(String name,int age) {

        ModelAndView mv = new ModelAndView();
        System.out.println("执行了addStu方法");
        mv.setViewName("nameerror");
        return mv;
    }
}


