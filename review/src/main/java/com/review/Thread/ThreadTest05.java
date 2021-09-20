package com.review.Thread;

/**
 * @author 小白
 * @create 2021/2/27
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t1= new Thread(new MyRunnableTwo());
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1要醒了");
        //终断t1线程的睡眠(这种终断睡眠的方式依靠java的异常处理机制)
        t1.interrupt();

    }
}
class MyRunnableTwo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}
