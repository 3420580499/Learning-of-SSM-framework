package com.good.controller;

import com.good.exception.AgeException;
import com.good.exception.NameException;
import com.good.exception.UserException;
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
    public ModelAndView addStu(String name,int age) throws UserException {
        //处理NameException的异常
        /*
         异常处理逻辑:
         1.需要把异常记录下来,记录到数据库,日志文件.
           记录日志发生的时间,哪个方法发生的,异常错误的内容.
         2.发送通知,把异常的信息通过邮件,短信,微信发送给相关的人员.
         3.给用户友好的提示.
         */
        ModelAndView mv = new ModelAndView();
        //前端表单不填写数据,传到此处是一个空字符串
        if(name.equals("")){
            throw new NameException("姓名不合法");
        }if(age<0){
            throw new AgeException("年龄不合法");
        }

        return mv;
    }
}


