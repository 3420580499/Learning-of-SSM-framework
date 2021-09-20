package com.good.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

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
     * 环绕通知的定义格式
     * 方法的定义要求:
     * 1.公共方法 public
     * 2.方法中有返回值,推荐使用Object
     * 3.方法名称自定义
     * 4.方法有参数,固定的参数: ProceedingJoinPoint
     */

    /**
     * @Around: 环绕通知注解
     * 属性:1.value,是切入点表达式,表示切面的功能执行的位置
     * 位置:在方法定义的上面
     * 特点:1.它是功能最强的通知
     *     2.在目标方法的前和后都能增强功能
     *     3.控制目标方法是否被调用执行
     *     4.修改原来的目标方法的执行结果,影响最后的调用结果
     *
     * 环绕通知等同于jdk动态代理的InvocationHandler接口
     *
     * 参数:ProceedingJoinPoint等同于Method
     *      作用:执行目标方法
     * 返回值:就是目标方法的执行结果,可以被修改
     */
     @Around(value = "execution(String *..doOther(..))")
     public Object myAround(ProceedingJoinPoint point) throws Throwable {
         //实现环绕通知
         Object result = null;
         System.out.println("环绕通知,在目标方法执行前输出事件-->"+new Date());
         //目标方法的调用
         result = point.proceed();//method.invoke(); Object result = doOther();
         Object objs[] = point .getArgs();
         if(objs[0]==null){
             return result;
         }
         //根据匹配结果在目标方法前后加入功能
         if(objs[0].equals("未知")){
             System.out.println("环绕通知,在目标方法执行后提交事务");
         }
         //返回目标方法的执行结果
         return result;
     }


}
