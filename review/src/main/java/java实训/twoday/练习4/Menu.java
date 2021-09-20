package java实训.twoday.练习4;

/**
 * @author 小白
 * @create 2021/6/22
 */
public class Menu {
    public static String showLoginMenu(){
       return  "*欢迎使用我行我素购物管理系统*"+"\n"+"\t"+"1.登录系统"+"\n"+"\t"+"2.退出系统";

    }
    public static String showMainMenu(){
        return  "*主菜单*"+"\n"+"\t"+"1.客户信息管理"+"\n"+"\t"+"2.真情回顾";

    }
    public static String showSendGMenu(){
       return  "*真情回顾*"+"\n"+"\t"+"1.幸运大放送"+"\n"+"\t"+"2.幸运抽奖"+"\n"+"\t"+"3.生日问候";
    }
}
