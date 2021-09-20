package test01;

/**
 * @author 小白
 * @create 2021/6/8
 */
public class Person {
   private String Name;
   private int age;
   private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, int age, Address address) {
        Name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }
}
