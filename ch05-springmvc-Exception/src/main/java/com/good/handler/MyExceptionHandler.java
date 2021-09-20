package com.good.handler;

import com.good.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 小白
 * @create 2021/4/26
 */

/**
 * (@ControllerAdvice):控制器增强(也就是给控制器类增加功能--异常处理功能)
 *        位置:在类的上面
 *特点:必须让框架知道这个注解所在的包名,需要在springmvc中配置文件声明组件扫描器
 * 指定@ControllerAdvice所在的包名
 */
@ControllerAdvice
public class MyExceptionHandler {
    /**
     * 处理异常的方法和控制器方法的定义一样,可以有多个参数,可以有ModelAndView,
     * String,void,对象类型的返回值
     */
    //符合AOP
    //表示发生了NameException异常回执行此方法
    @ExceptionHandler(value= NameException.class)
    public ModelAndView dosome(Exception exception ){
        ModelAndView mv = new ModelAndView ();
        mv.addObject("ex",exception);
        mv.addObject("message","姓名不合法");
        mv.setViewName("nameerror");
        return mv;
    }

    //不写value表示没有发生上面方法异常时就执行此方法(其实就写这一个方法就行,将所有的异常交给此方法来处理)
    @ExceptionHandler
    public ModelAndView doOther(Exception exception ){
        ModelAndView mv = new ModelAndView ();
        mv.addObject("ex",exception);
        mv.addObject("message","姓名不合法");
        mv.setViewName("nameerror");
        return mv;
    }
}
