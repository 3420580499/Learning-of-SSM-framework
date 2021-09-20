package com.good.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author 小白
 * @create 2021/3/12
 */

/**
 * @Aspect :是aspectj框架中的注解
 * 作用:表示当前类是切面类
 * 切面类:是用来给业务方法增加功能的类,这个类中有切面的功能代码
 * 位置:在类定义的上面
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法,方法是实现切面功能的
     * 方法的定义要求:
     * 1.公共方法 public
     * 2.方法中没有返回值
     * 3.方法名称自定义
     * 4.方法可以有参数,也可以没参数
     *    如果有参数,参数不是自定义的,有几个参数类型可以使用
     */

    /**
     * @Before :前置通知注解
     * 属性:value,是切入点表达式,表示切面的功能执行的位置
     * 位置:在方法的上面
     * 特点:1.在目标方法之前先执行的
     *     2.不会改变目标方法的执行结果
     *     3.不会影响目标方法的执行
     *
     */
    /**
     * 指定通知方法中的参数:JoinPoint
     * JoinPoint:业务方法,要加入的切面功能的业务方法
     *     作用是:可以通知方法中获取方法执行时的信息,例如方法名称,方法的实参
     *     如果你的切面功能中需要用到方法的信息,就加入JoinPoint
     *     这个JoinPoint参数的值由框架赋予.必须是第一个位置的参数
     *
     */
    //@Before(value="execution(public void com.good.ba01.SomeService.doSome(String,Integer))")
    @Before(value="execution(* *..do*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法的签名(定义): "+joinPoint.getSignature());
        System.out.println("方法的名称: "+joinPoint.getSignature().getName());
        Object [] objs =joinPoint.getArgs();
        for(Object obj : objs){
            System.out.println("方法的参数: "+obj);
        }
        //就是你切面要执行的功能代码
        System.out.println("前置通知,切面功能:增加的功能是获取当前时间"+new Date());
    }
}
