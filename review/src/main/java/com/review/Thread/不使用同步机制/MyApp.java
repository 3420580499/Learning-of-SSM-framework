package com.review.Thread.不使用同步机制;

/**
 * @author 小白
 * @create 2021/4/15
 */
public class MyApp {
    public static void main(String[] args) {
        Account account=new Account("金库",20000);
        AccountThread t1 = new AccountThread(account);
        AccountThread t2 = new AccountThread(account);
        t1.start();
        t2.start();
    }
}
