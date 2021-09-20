package com.review.Thread.不使用同步机制;

/**
 * @author 小白
 * @create 2021/4/15
 */
public class AccountThread extends Thread {
    //两个线程必须共享一个线程对象
    private Account act;
    //通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act=act;
    }

    @Override
    public void run() {
          double money =5000;
          act.withdrawal(money);
          System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款"+money+",余额"+act.getBalance());
    }
}
