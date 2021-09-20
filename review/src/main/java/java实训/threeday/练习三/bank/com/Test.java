package java实训.threeday.练习三.bank.com;

import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Test {
    public static void main(String[] args) {
        Account account =new Account();
        Scanner sc = new Scanner(System.in);
        int num;
        int m;
        while(true){
            System.out.println("1.存款"+"  2.取款" +" 3.退出");
            System.out.print("请选择你要办理的业务:");
            num = sc.nextInt();
            if(num ==1){
                System.out.print("存入的金额:");
               m= sc.nextInt();
               account.add(m);
                System.out.println("余额"+account.getMoney());
            }else if(num ==2){
                System.out.print("取出的金额");
                m=sc.nextInt();
                account.jian(m);
                System.out.println("余额"+account.getMoney());
            }
            else {
                break;
            }
        }
        System.out.println("谢谢");
    }
}
