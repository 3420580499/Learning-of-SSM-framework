package com.good.ba04;

import org.aspectj.lang.annotation.AfterThrowing;
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
     * 异常通知的定义格式
     * 方法的定义要求:
     * 1.公共方法 public
     * 2.方法中没有返回值
     * 3.方法名称自定义
     * 4.方法有参数,固定的参数:Exception(可带一个参数JoInPoint)
     */


     @AfterThrowing(value = "execution(String *..doOther(..))",throwing = "exception")
     public void myAround(Exception exception) {
         System.out.println("异常通知,"+exception.getMessage());
     }


}
