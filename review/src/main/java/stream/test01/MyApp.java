package stream.test01;

import lambda.Test01.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 小白
 * @create 2021/5/29
 */
public class MyApp {
    public static void main(String[] args) {
        List<Student> stuList = Arrays.asList(
                new Student("李四",12,"A"),
                new Student("张三",21,"B"),
                new Student("王五",34,"B"),
                new Student("赵六",32,"A")
        );
        //创建Stream流
        //中间操作
        Stream<Student> stream = stuList.stream().filter((x) -> x.getAge() > 20).limit(2);
         //终止操作
        stream.forEach(System.out::println);

        stuList.stream().map(Student::getName).forEach(System.out::println);
    }

}
