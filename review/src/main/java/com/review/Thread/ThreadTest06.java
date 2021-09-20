package com.review.Thread;

/**
 * @author 小白
 * @create 2021/2/28
 */

/**
 * 强行终止线程的执行(直接杀死线程,容易丢失数据,不建议使用)
 */
public class ThreadTest06 {
    public static void main(String[] args) {
       Thread t1 =new Thread(new MyRunnable02());
       t1.setName("t1线程");
       t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.stop();
    }
}
class MyRunnable02 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
