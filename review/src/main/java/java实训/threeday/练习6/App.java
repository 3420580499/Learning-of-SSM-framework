package java实训.threeday.练习6;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class App {
    public static void main(String[] args) {
       Dog dog = new Dog("狗",100,20,"牧羊犬");
       System.out.println(dog.getStrain()+" "+dog.getName()+" "+dog.getHealth()+" "+dog.getLove());
       Penguin penguin = new Penguin("企鹅",100,20,"Q仔");
       System.out.println(penguin.getSex()+" "+dog.getName()+" "+dog.getHealth()+" "+dog.getLove());
    }

}
