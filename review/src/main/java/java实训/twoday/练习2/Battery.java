package java实训.twoday.练习2;

/**
 * @author 小白
 * @create 2021/6/22
 */
public class Battery {
    String type;
    public Battery(String type) {
        this.type = type;
    }

    public void cell(){
        System.out.println("给电池蓄电");
    }
}
