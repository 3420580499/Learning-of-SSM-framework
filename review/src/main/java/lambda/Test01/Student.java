package lambda.Test01;

import java.util.Comparator;

/**
 * @author 小白
 * @create 2021/5/29
 */
public class Student {
    private String name;
    private int age;
    private String grade;

    public Student() {
    }

    public Student(String name, int age,String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
