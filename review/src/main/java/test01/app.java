package test01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/21
 */
public class app {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int i =scanner.nextInt();
        boolean boo = false;
        for(int n :num){
            if(n==i){
                boo=true;
                break;
            }
        }
        System.out.println(boo);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一家的价格");
        int a = scanner.nextInt();
        System.out.println("请输入第二家的价格");
        int b = scanner.nextInt();
        System.out.println("请输入第三家的价格");
        int c = scanner.nextInt();
        System.out.println("请输入第四家的价格");
        int d = scanner.nextInt();
        Integer num []={a,b,c,d};
        System.out.println(Arrays.stream(num).min(Integer::compare).get());
    }
}
