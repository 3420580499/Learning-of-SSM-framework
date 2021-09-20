package com.review.Thread;

/**
 * @author 小白
 * @create 2021/2/25
 */

/**
 * 第二种方式:实现Runnable接口(采用匿名内部类)
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("分支线程-->"+i);
                }
            }
        });
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
