package com.review.extend;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Test {
    public static void main(String[] args) {
        B b = new B("11",456,"3452");
        System.out.println(b.show());
        b.dute();
        A b2 = new B("11",456,"3452");
        System.out.println(b2.show());
    }


}
