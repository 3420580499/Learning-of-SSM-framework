package lambda.Test01;


import java.util.Collections;

/**
 * @author 小白
 * @create 2021/5/29
 */
//lambda表达式
public class MyApp {
    public static void main(String[] args) {
        int result = increment(100, (x) -> x + x);
        System.out.println(result);
    }
    public static Integer increment(Integer num,MyFun fun){
        return fun.getValue(num);
    }
}


