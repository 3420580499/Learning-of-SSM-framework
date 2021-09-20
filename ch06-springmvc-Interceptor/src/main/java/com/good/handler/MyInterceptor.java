package com.good.handler;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 小白
 * @create 2021/5/1
 */

//拦截器类拦截用户请求
public class MyInterceptor implements HandlerInterceptor {
    /**
     * perHandle方法叫做预处理方法
     *   重要:是整个项目的吐口,门户.当preHandle返回true,请求可以被处理
     *        preHandle返回false,请求此方法就截止
     *
     *参数:Object Handler :被拦截的控制器对象(就是myController)
     * 返回值:boolean
     *   true:请求是通过拦截器的验证,可以执行处理器方法
     *   false:请求没有通过拦截器的验证,请求到达拦截器就停止了,请求没有被处理
     *
     * 特点:
     *    1.方法在控制器方法(MyController的addStu)之前执行的
     *       用户的请求首先到达此方法
     *
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了perHandle方法");
        return true;
    }


    /**
     *postHandler方法:后处理方法]
     * 参数:
     * Object Handler :被拦截的处理器对象myController
     * ModelAndView:处理器方法的返回值
     *
     * 特点:
     * 1.在处理器方法之后执行的(即addStu方法之后)
     * 2.能够获取到处理器方法的返回值ModelAndView,可以修改ModelAndView中的数据和视图,可以影响到最后的执行结果
     * 3.主要是对原来的执行结果进行二次修正
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行了postHandle方法");
    }


    /**
     *afterCompletion方法:最后执行的方法
     * 参数:
     * Object Handler:被拦截的控制器对象
     * Exception ex :程序中发生的异常
     * 特点:
     * 1.在请求处理完成后执行,框架中规定是当你的视图处理完成后,对视图执行了forward,就认为请求处理完成
     * 2.一般做资源回收工作的,程序请求过程中创建了一些对象,在这里可以删除,把占用的内存回收
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行了afterCompletion方法");
    }
}
