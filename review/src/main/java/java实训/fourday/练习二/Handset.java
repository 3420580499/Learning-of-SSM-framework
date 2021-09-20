package java实训.fourday.练习二;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author 小白
 * @create 2021/6/24
 */
public class Handset {
    private String brand;
    private String type;

    public Handset(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void sendInfo(){
        System.out.print("发送");
        this.info();
    }
    public void call(){
        System.out.println("开始视屏通话");
    }
    public void info(){
        System.out.println("图片和文字");
    }

    @Override
    public String toString() {
        return "这是一款型号为" + brand + '\'' +
                ",名为" + type + '\'';
    }
}
