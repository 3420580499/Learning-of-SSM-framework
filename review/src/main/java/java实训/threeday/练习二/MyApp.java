package java实训.threeday.练习二;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class MyApp {
    public static void main(String[] args) {
        CustomBiz customBiz = new CustomBiz (new String[45]);
        Scanner sc = new Scanner(System.in);
        String name;
        int i =0;
        while(true){
            System.out.print("请输入客户的姓名");
            name =sc.next();
            customBiz.addName(name,i);
            i++;
            System.out.print("是否继续? y/n");
            name =sc.next();
            if(name.equals("n")){
                break;
            }
        } for(int j=0;j<i;j++){
            System.out.println(customBiz.names[j]);
        }

    }
}
