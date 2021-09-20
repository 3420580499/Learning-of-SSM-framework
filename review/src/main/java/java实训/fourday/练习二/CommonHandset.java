package java实训.fourday.练习二;

/**
 * @author 小白
 * @create 2021/6/24
 */
public class CommonHandset extends Handset implements PlayWiring {
    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void play(String content) {
        System.out.println("播放"+content);
    }
}
