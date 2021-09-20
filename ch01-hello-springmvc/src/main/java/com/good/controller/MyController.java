package com.good.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class MyController {
    /**
     *处理用户提交的请求,在springmvc中是使用方法来处理的
     *方法是自定义的,可以使用多种返回值,多种参数,方法名称自定义
     */

    /**
     *准备使用dosome方法处理some.do请求
     * (@RequestMapping):请求映射,作用是把一个请求地址和一个方法锁定在一起
     *                   一个请求指定一个方法处理
     *属性:1.value 是一个String,表示请求的URL地址的(some.do)
     *      value的值必须是唯一的,不能重复.在使用时,推荐地址一"/"
     *位置:1.在方法的上面,常用的.
     *    2.在类的上面
     *
     *说明:使用@RequestMapping修饰的方法叫做处理器方法或者控制器方法
     *使用@RequestMapping修饰的方法可以处理请求的,类似Servlet中的doget(),dopost()
     *
     *返回值:ModelAndView表示本次请求的处理结果
     *    Model:数据,请求处理完成后,要显示给用户的数据
     *    view:视图,比如jsp等
     */
    //value还可以写成数组形式
    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(){  //doget()--service请求处理
        //处理some.do请求了,相当于service调用处理完成
        ModelAndView mv =new ModelAndView();

        //添加数据,框架在请求的最后把数据放入到request作用域
        //request.setAttribute("msg","调用dosome方法返回结果");
        mv.addObject("msg","调用dosome方法返回结果");

        //指定视图,指定视图的完整路径
        //框架对视图执行的forward操作,request,getRequestDispather("/result.jsp").forward(...)
        //mv.setViewName("/result.jsp");
        //mv.setViewName("/WEB-INF/view/result.jsp")

        //当配置了视图解析器后,可以使用逻辑名称(文件名),指定视图
        //框架使用视图解析器的 前缀+逻辑名称+后缀 组成完整的路径,这里就是字符连接操作
        // /WEB-INF/view/+result+.jsp
        mv.setViewName("result");

        //返回MV
        return mv;
    }
}
