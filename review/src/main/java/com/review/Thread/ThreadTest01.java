package com.review.Thread;

/**
 * @author 小白
 * @create 2021/2/25
 */

/**
 * 第一种方式:继承Thread类
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();
        for (int i=0;i<100;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
       for (int i=0;i<100;i++){
           System.out.println("分支线程-->"+i);
       }
    }
}
