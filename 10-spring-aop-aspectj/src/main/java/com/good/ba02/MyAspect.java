package com.good.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

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
     * 后置通知定义方法,方法是实现切面功能的
     * 方法的定义要求:
     * 1.公共方法 public
     * 2.方法中没有返回值
     * 3.方法名称自定义
     * 4.方法有参数,推荐是Object,参数名自定义
     */

    /**
     * @AfterReturning: 前置通知注解
     * 属性:1.value,是切入点表达式,表示切面的功能执行的位置
     *     2.returning 自定义的变量,表示目标方法的返回值
     *       自定义变量必须和通知方法的形参名一样
     * 位置:在方法定义的上面
     * 特点:1.在目标方法之后执行的
     *     2.能够获取到目标方法的返回值,可以根据这个返回值做不同的处理功能
     *      Object obj = doOther();
     *     3.可以修改这个返回值
     *
     *     后置通知的执行
     *     Object obj = doOther();
     *     myAfterReturning(Object obj);
     */
     @AfterReturning(value = "execution(String *..doOther(..))",returning = "obj")
     //obj为目标方法的返回值
     //注意JoinPoint只能为第一个参数
     public void myAfterReturning(JoinPoint point , Object obj){
         System.out.println("后置通知,方法的定义->"+point.getSignature());
         System.out.println("后置通知,返回的值是-->"+obj);
         //根据返回值可以做一些其他的功能
         //这里修改obj的值的话,会不会影响目标方法的返回值呢?
     }


}
