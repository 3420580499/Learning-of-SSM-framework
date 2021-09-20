package java实训.twoday.练习2;

/**
 * @author 小白
 * @create 2021/6/22
 */
public class Phone{

    public void music(){
        this.download();
        System.out.println("播放下载的音乐");
    }
    public void download(){
        System.out.println("下载音乐");
    }

    public void  chongDian(){
       Battery battery = new Battery("xx");
       battery.cell();


    }

}
