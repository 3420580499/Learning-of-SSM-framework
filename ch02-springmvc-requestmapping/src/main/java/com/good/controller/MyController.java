package com.good.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 小白
 * @create 2021/4/11
 */


/**
 * (@Controller):创建处理器对象,对象放在springmvc容器中
 * 位置:在类的上面
 * 和spring中讲的@Service,@Component
 *
 * 能处理请求的都是控制器(处理器):MyController能处理请求,
 *                         叫做后端处理器(back controller)
 */
@Controller
//此处写了user,下面的路径之前就默认加上一个user
//@RequestMapping("/user")
//相当于你默认的路径为"/user/some.do"
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(){  //doget()--service请求处理
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","调用dosome方法返回结果");
        mv.setViewName("result");
        return mv;
    }

    /**
     * (@RequestMapping):请求映射
     *               属性:method,表示请求的方式,他的值RequestMethod为枚举值
     *                   例如表示get请求方式,RequestMethod.GET
     *
     * 你不用get方式访问,就会报错:
     * HTTP Status 405 - Request method 'post' not support
     */

    /**
     *逐个接收请求参数:
     *   要求:处理器(控制器)方法的形参名和请求中参数ing必须一致
     *        同名的请求参数赋值个同名的形参
     *框架接收请求参数
     *    1.使用request对象接收请求参数
     *      String strName=request.getParameter("name");
     *      String strAge=request.getParameter("age");
     *    2.springmvc框架通过DispatcherServlet调用MyController的doOther方法
     *      调用方法时,按名称对应,把接收的参数赋值个形参
     *      doOther(String name,Integer.valueOf(strAge));
     *      框架会提供类型转换的功能,能把String转为int,long,float,double等类型
     */
    @RequestMapping(value = "/other.do",method = RequestMethod.POST)
    public ModelAndView  doOther(String name,int age){
        ModelAndView mv =new ModelAndView();
        //可以在法中直接使用name和age了
        //处理other.do请求了,相当于service调用完成了
        mv.addObject("msg","调用doOther方法返回结果");
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("result");
        return mv;
    }

}
