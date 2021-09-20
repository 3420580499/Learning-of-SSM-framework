package java实训.twoday;

/**
 * @author 小白
 * @create 2021/6/22
 */
public class User {
    private String name;
    private String Password;
    public User(){

    }
    public User(String name, String password) {
        this.name = name;
        Password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "姓名:" + name + '\'' +
                ", 密码:'" + Password + '\'' +
                '}';
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
