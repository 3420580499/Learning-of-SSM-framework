package java实训.fourday.练习二;

/**
 * @author 小白
 * @create 2021/6/24
 */
public class Test {
    //int g=0;
    public static void main(String[] args) {
        Handset h1 = new AptitudeHandst("I9100","HTC手机");
        System.out.println(h1);
        AptitudeHandst aptitudeHandst=(AptitudeHandst)h1;
        aptitudeHandst.networkConn();
        aptitudeHandst.takePicture();
        aptitudeHandst.sendInfo();
        aptitudeHandst.call();
        System.out.println("=====================");
        Handset h2 = new CommonHandset("G502C","索尼爱丽信手机");
        System.out.println(h2);
        h2.sendInfo();
        h2.call();
        CommonHandset commonHandset=(CommonHandset)h2;
        commonHandset.play("热血");
        //System.out.println(g);
    }
}
