package com.review.Thread.同步;

/**
 * @author 小白
 * @create 2021/6/28
 */
public class App {
    public static void main(String[] args) {
        SaleTicks saleTicks = new SaleTicks(100,0);
        Thread t1 = new Thread(saleTicks);
        Thread t2 = new Thread(saleTicks);
        Thread t3 = new Thread(saleTicks);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
