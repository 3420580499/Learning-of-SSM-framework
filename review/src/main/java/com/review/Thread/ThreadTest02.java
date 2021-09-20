package com.review.Thread;

/**
 * @author 小白
 * @create 2021/2/25
 */

/**
 * 第二种方式:实现Runnable接口
 * 第二种方式实现接口比较常用,因为一个类实现了接口,它还可以去继承其他的类,更灵活
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable runnable =new MyRunnable();
        //将可运行的对象封装为一个线程对象
        Thread thread= new Thread(runnable);
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
//这并不是一个线程类,而是一个可运行类,他还不是一个线程
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("分支线程-->"+i);
        }
    }
}
