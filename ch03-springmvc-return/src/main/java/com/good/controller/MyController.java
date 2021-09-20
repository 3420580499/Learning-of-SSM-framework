package com.good.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.good.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小白
 * @create 2021/4/11
 */


/**
 * 处理器方法的返回值表示处理结果
 * 1.ModelAndView:处理器方法的返回指表示请求的处理结果
 * 2.String:表示视图,可以逻辑名称,也可以是完整的路径名
 * 3.void:不能表示数据,也不能表示视图.
 *   在处理Ajax的时候,可以使用void返回值,通过HTTPServletRequest输出数据,响应Ajax请求
 *   Ajax请求服务器端返回的就是数据
 */
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(){  //doget()--service请求处理
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","调用dosome方法返回结果");
        mv.setViewName("result");
        return mv;
    }

    /**
     *请求中参数名和处理器方法的形参名不一样
     * (@RequestParam):解决请求中参数名和形参名不一样的问题
     *    属性:1.value 请求中的参数名称
     *        2.required 是一个boolean,默认是true
     *           true:表示请求中必须包含此参数
     *    位置: 在处理器方法的形参定义的前面
     */

    /**
     * 还可以将方法参数设为java对象(Student student),这个对象的属性名和请求中参数名一样
     * 框架会创建形参的java对象,给属性赋值,请求中的参数是name,框架会自动调用setName()
     */
    @RequestMapping(value = "/other.do" )
    public ModelAndView  doOther(@RequestParam(value ="stuname",required = false) String name,
                                @RequestParam(value = "stuage", required = false) int age){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","调用doOther方法返回结果");
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("result");
        return mv;
    }

    /**
     *处理器方法返回值可设为String--表示逻辑视图名称,需要配置视图解析器
     */
    @RequestMapping(value = "/xxx.do")
    public String doing1(HttpServletRequest request , String name , int age) throws Exception {
        request.setAttribute("name",name);
        request.setAttribute("age",age);
        return "result";
    }



    //返回值为void
    @RequestMapping(value = "/doing.do")
    public void doing(HttpServletResponse response, String name , int age) throws Exception {
        //处理Ajax,请求json做数据的格式
        //service调用完成了,使用Student表示处理结果
       Student stu = new Student(name,age);
       String json="";
       //把结果的对象转换为json格式的数据
       if(stu != null){
           ObjectMapper om = new ObjectMapper();
           json=om.writeValueAsString(stu);
       }
       //输出数据,响应Ajax的请求
       response.setContentType("application/json,charset=utf-8");
       response.getWriter().println(json);

    }


    /**
     * 处理器方法返回一个Student对象,通过框架转为json,响应Ajax请求
     * (@ResponseBody)作用:把处理器对象转为json后,将返回数据通过HttpServletResponse输出给浏览器
     *                位置:放在方法上面,和其他注解没有前后顺序
     */
    //返回值是object
    @ResponseBody
    @RequestMapping(value = "/obj.do")
    public Student doObj(String name,int age){
        Student stu = new Student(name,age);
        return stu;//会被框架转为json(可以看作简化的上一个方法)
    }

    /**
     *处理器方法返回对象数组
     */
    @ResponseBody
    @RequestMapping(value = "/objarray.do" )
    public List<Student> doObjArray(){
        List<Student> list = new ArrayList();
        //Student stu = new Student(name,age);
        Student stu= new Student("张三",21);
        Student stu1= new Student("lisi",21);
        list.add(stu);
        list.add(stu1);
        return list;//会被框架转为json数组(可以看作简化的上一个方法)
    }

    /**
     * 处理器方法返回String
     *   如果带有(@ResponseBody)注解,该String返回的是数据
     *   如果没有(@ResponseBody)注解,该String返回的是视图(和前面的一样)
     * 默认使用的是"text/plain;charset=Iso-8859-1"作为contentType,导致中文乱码
     * 解决方案:给(@RequestMapping)加上属性produces定义contentType
     */
    @ResponseBody
    @RequestMapping(value = "/doo.do",produces = "text/plain;charset=utf-8")
    public String doo(){
        return "我是数据,我是中文";
    }

    //以下可以解决访问不在解析器范围的地址
    /**
     * 处理器方法返回ModelAndView,实现转发forward
     * 语法:setViewName("forward:视图文件完整路径")
     * forward特点:不和视图解析器一同使用,就当项目中没有视图解析器
     */
     @RequestMapping(value = "/doForward.do")
    public  ModelAndView isForward(){
         ModelAndView mv =new ModelAndView();
         mv.addObject("msg","欢迎使用springmvc做web开发");
         mv.addObject("fun","执行的是isForward方法");
         //显示转发
         // mv.setViewName("forward:/WEB-INF/view/hello.jsp")
         mv.setViewName("forward:/WEB-INF/view/hello.jsp");
         return mv;
     }

    /**
     * 处理器方法返回ModelAndView,实现重定向redirect
     * 语法:setViewName("redirect:视图解析器")
     * redirect特点:不和视图解析器一同使用,就当项目中没有视图解析器
     *
     * 框架对重定向的操作:
     * 1.框架会把Model中的简单类型 ,转为String来使用,作为hello.jsp的get请求参数使用
     *     目的是在doRedirect和hello.jsp两次请求之间传递数据
     *
     * 2.在目标hello,jsp页面可以使用参数集合对象${param}获取请求参数值
     * ${param.myname}
     */
    @RequestMapping(value = "/doRedirect.do")
    public ModelAndView isRedirect(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("myname","lisi");
        mv.addObject("myage",10);
        //重定向
        //这种方式不行,重定向不能访问WEB-INF目录下的文件,请求转发可以
        // mv.setViewName("redirect:/WEB-INF/view/hello.jsp");
        mv.setViewName("redirect:/hello1.jsp");
        return mv;
    }
}
