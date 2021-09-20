package java实训.threeday.练习4;

import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符");
        String str= sc.next();
        System.out.println("请输入查询字符");
        String s = sc.next();
        char c []= str.toCharArray();
        for(int i =0;i<c.length;i++){
            if(c [i] == s.toCharArray()[0]){
                System.out.println(i);
            }
        }
    }
}
