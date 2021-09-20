package com.review.Thread.使用同步机制;

/**
 * @author 小白
 * @create 2021/4/15
 */

//银行账户
//不使用线程同步机制,多线程对同一个用户进行取款,存在线程安全问题
public class Account {
    private String actno;
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }

    //模拟取款的方法
    //对方法使用同步锁也行
    //public synchronized void withdrawal(double money)
    public void withdrawal(double money){
        synchronized (this){
            //System.out.println(this);
            double before = this.getBalance();
            double after=before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }

    }
}
