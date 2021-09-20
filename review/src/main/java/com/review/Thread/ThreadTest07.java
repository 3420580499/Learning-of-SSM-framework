package com.review.Thread;

/**
 * @author 小白
 * @create 2021/3/2
 */

/**
 * 合理的终止一个线程
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        MyRunnable03 r = new MyRunnable03();
        Thread t1 =new Thread(r);
        t1.setName("t1线程");
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run=false;
    }
}
class MyRunnable03 implements Runnable{
    //打一个布尔标记
    boolean run=true;

    @Override
    public void run() {
           for(int i=0;i<10;i++){
               if(run){
                   System.out.println(Thread.currentThread().getName()+"-->"+i);
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else{
                   return;
               }
           }

    }
}
