package java实训.threeday.练习6;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Dog extends Pet {
    private String strain;


    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

}
