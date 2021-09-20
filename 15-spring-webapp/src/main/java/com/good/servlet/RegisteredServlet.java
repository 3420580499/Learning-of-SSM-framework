package com.good.servlet;

import com.good.entity.Student;
import com.good.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/4/8
 */
public class RegisteredServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");

        /*Student  stu = new Student(Integer.parseInt(id),name,email,Integer.parseInt(age));
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationcontext.xml");
        StudentService service=(StudentService) act.getBean("studentService");
        service.addStudent(stu);*/
        Student  stu = new Student(Integer.parseInt(id),name,email,Integer.parseInt(age));
        WebApplicationContext act=(WebApplicationContext)getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        StudentService service=(StudentService) act.getBean("studentService");
        service.addStudent(stu);

        //使用框架提供的工具类
       /* ServletContext sc =getServletContext();
        WebApplicationContext ac=WebApplicationContextUtils.getRequiredWebApplicationContext(sc);*/
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
