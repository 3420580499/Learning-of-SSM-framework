package java实训.twoday;

import java.util.function.Supplier;

/**
 * @author 小白
 * @create 2021/6/22
 */
public class TwoApp {
    public static void main(String[] args) throws Exception {
        User user1 = new User("admin1","111111");
        User user2= new User("admin2","222222");
        System.out.println(user1);
        System.out.println(user2);
        /*Supplier<User> supplier=() ->  new User("admin3","333333");
        System.out.println(supplier.get());*/
        /*Class clazz = User.class;
        User user = (User) clazz.getConstructor().newInstance();
        System.out.println(user);*/
    }


}
