package java实训.threeday.练习6;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Penguin extends Pet {
    private String sex;


    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

}
