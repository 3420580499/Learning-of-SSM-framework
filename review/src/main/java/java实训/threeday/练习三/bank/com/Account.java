package java实训.threeday.练习三.bank.com;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Account {
    int money;

    public Account(int money) {
        this.money = money;
    }

    public Account() {
    }
    //当前余额
    public int getMoney(){
        return this.money;
    }
    //存款
    public void add(int money){
        this.money = this.money+money;
        System.out.println("存款成功");
    }
    //取款
    public void jian(int money){
        if( this.money < money){
            System.out.println("余额不足");
        }else{
            this.money = this.money-money;
            System.out.println("取款成功");
        }
    }
}
