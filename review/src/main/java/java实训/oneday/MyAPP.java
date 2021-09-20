package java实训.oneday;

import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/21
 */
public class MyAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String func = "*欢迎进入奖富翁系统*"+"\n"+"\t"+"1.注册"+"\n"+"\t"+"2.登录"+"\n"+"\t"+"3.抽奖";
        while(true){
            System.out.println(func);
            System.out.print("请选择菜单:");
            int num = sc.nextInt();
            if(num ==1){
                System.out.println("[富翁系统>注册]");
                System.out.print("继续吗(y/n)");

                String flag =sc.next();
                if(flag.equals("n")){
                    System.out.println("系统退出");
                    break;
                }
            }
            if(num ==2){
                System.out.println("[富翁系统>登录]");
                System.out.print("继续吗(y/n)");
                String flag=sc.next();
                if(flag.equals("n")){
                    System.out.println("系统退出");
                    break;
                }
            }
            if(num ==3){
                System.out.println("[富翁系统>抽奖]");
                System.out.print("继续吗(y/n)");
                String flag=sc.next();
                if(flag.equals("n")){
                    System.out.println("系统退出");
                    break;
                }
            }
        }

    }
}

