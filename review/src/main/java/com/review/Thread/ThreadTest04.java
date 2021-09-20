package com.review.Thread;

/**
 * @author 小白
 * @create 2021/2/25
 */

/**
 * 获取当前线程对象
 * 关于线程的sleep方法(使用native修饰的方法为原生函数,其里面并没有方法体,具体是由其他语言实现的.)
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //表示当前线程对象为主线程main
        Thread now = Thread.currentThread();
        System.out.println(now.getName());
        MyThread2 t1=new MyThread2();
        t1.setName("t1线程对象");
        t1.start();
        try {
            //在执行的时候还是会转换为Thread.sleep(2000);
            t1.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 t2=new MyThread2();
        t2.setName("t2线程对象");
        t2.start();
        System.out.println("5秒后主线程醒了-------------------------------------->");
    }

}
class MyThread2 extends Thread{
    @Override
    //此处不能直接抛出异常,因为子类不能比父类抛出更多的异常
    public void run() {
        try {
            //this.sleep(2000);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0;i<100;i++){
            //这个this表示的是当前的线程对象
            System.out.println(this.getName()+"-->"+i);
        }
    }
}

