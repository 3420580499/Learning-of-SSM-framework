package com.good.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

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
     * 最终通知的定义格式(执行目标方法后一定会输出,相当于try-catch中的finally)
     * 方法的定义要求:
     * 1.公共方法 public
     * 2.方法中没有返回值
     * 3.方法名称自定义
     * 4.方法可以无参数,也可以只有一个参数JoinPoint
     */
    /**
     * @Pointcut: 定义和管理切入点的,如果你的项目中有多个切入点表达式是重复的,可以复用的可以使用它
     * 属性:value 切入点表达式
     * 位置:在自定义的方法上面
     * 特点:
     *    当使用@Pointcut定义在一个方法的上面,此时这个方法的名称就是切入点表达式的别名
     *    其他的通知中,value属性就可以使用这个方法的名称了,代替切入点表达式
     */
     @Pointcut(value = "execution(String *..doOther(..))")
     //一般为私有的,外界不需要调用的
     private void function(){
       //此处无需代码
     }


     @After(value = "function()")
     public void myAfter() {
         System.out.println("最终通知");
     }


}
