package com.review.Thread.同步;

/**
 * @author 小白
 * @create 2021/6/28
 */
public class SaleTicks implements Runnable{
    int total;
    int nowTicket;
    public SaleTicks(int total, int nowTicket) {
        this.total = total;
        this.nowTicket = nowTicket;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(this){
                  if(total==nowTicket){
                      break;
                  }else{
                      nowTicket++;
                      System.out.println(Thread.currentThread().getName()+"-->当前卖出第"+nowTicket+"张票");
                  }
            }
        }

    }
}
