package java实训.threeday.练习6;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class Pet {
    private  String  name;
    private int health;
    private int love;
    public Pet (){

    }
    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public void print() {
        System.out.println(
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love
               );
    }
    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }
}
