package com.review.socket;

import java.net.InetAddress;

/**
 * @author 小白
 * @create 2021/4/9
 */
public class TestIp {
    public static void main(String[] args) throws Exception{
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println(ip);
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        System.out.println(InetAddress.getByName("www.baidu.com"));
    }
}
