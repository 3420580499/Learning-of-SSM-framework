package java实训.twoday.练习4;

import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/22
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num ;
        while(true){
            System.out.println(Menu.showLoginMenu());
            System.out.print("请选择,输入数字:");
            num = sc.nextInt();
            if(num==2){
                break;
            }
            while(true){
                    System.out.println(Menu.showMainMenu());
                    System.out.print("请选择,输入数字或按0返回上一级菜单:");
                    num = sc.nextInt();
                    if (num == 0) {
                        break;
                    }
                    while(true){
                        if(num ==2){
                            System.out.println(Menu.showSendGMenu());
                            System.out.print("请选择,输入数字或按0返回上一级菜单:");
                            num = sc.nextInt();
                            if (num ==0){
                                break;
                            }else if(num ==1){
                                System.out.println("幸运大放送");
                                break;
                            }
                        }

                    }
            }
            System.out.println("谢谢使用");
        }

    }
}
