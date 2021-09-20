package java实训.fourday.练习二;

/**
 * @author 小白
 * @create 2021/6/24
 */
public class AptitudeHandst extends Handset  implements TheakePictures,NetWork {
    public AptitudeHandst(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void networkConn() {
        System.out.println("已启动移动网络");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照成功");
    }

}
