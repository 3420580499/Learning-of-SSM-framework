package java实训.twoday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/21
 */
public class OneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List list = new ArrayList();
;       String name = null;
        String password = null;
        String func = "*欢迎进入奖富翁系统*"+"\n"+"\t"+"1.注册"+"\n"+"\t"+"2.登录"+"\n"+"\t"+"3.抽奖";
        while(true){
            System.out.println(func);
            System.out.print("请选择菜单:");
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("[富翁系统>注册]");
                System.out.println("请填写个人注册信息:");
                System.out.print("用户名:");
                name = sc.next();
                System.out.print("密码:");
                password = sc.next();
                System.out.println("注册成功,请记住你的卡号");
                int card = (int)(Math.random()*(9999-1000))+1000;
                System.out.println("用户名:"+name+" 密码:"+password+" 会员卡号:"+card);
            }else if(num ==2){
                System.out.println("[富翁系统>登录]");
                System.out.print("用户名:");
                String oldname = sc.next();
                System.out.print("密码:");
                String oldpassword = sc.next();
                if(oldname.equals(name) && oldpassword.equals(password)){
                    System.out.println("欢迎你:"+name);
                }else {
                    System.out.println("用户名或密码错误");
                    continue;
                }

            }else {
                boolean flag = false;
                System.out.println("[富翁系统>抽奖]");
                System.out.print("请输入你的卡号:");
                int card = sc.nextInt();
                for(int i=0;i<5;i++){
                    int newcard = (int)(Math.random()*(9999-1000))+1000;
                    list.add(newcard);
                }
                for(Object i :list){
                    if((int)i == card){
                        System.out.println("恭喜你,中奖了");
                        flag=true;
                        break;
                    }
                }
                if(flag == false){
                    System.out.println("抱歉,你未中奖");
                }
            }
            System.out.print("继续吗(y/n)");
            String flag =sc.next();
            if(flag.equals("n")){
                System.out.println("系统退出");
                break;
            }

    }
}}
