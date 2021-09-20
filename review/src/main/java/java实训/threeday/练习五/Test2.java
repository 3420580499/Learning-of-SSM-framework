package java实训.threeday.练习五;

import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符");
        String str= sc.next();
        System.out.println("请输入查询字符");
        String s = sc.next();
        int result=str.indexOf(s);
        while(result != -1){
            System.out.println(result);
            result=str.indexOf(s, result+s.length());
        }
    }
}
