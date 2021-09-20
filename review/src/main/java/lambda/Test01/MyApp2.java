package lambda.Test01;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

/**
 * @author 小白
 * @create 2021/5/29
 */
public class MyApp2 {
    public static void main(String[] args) {
        Student stu = new Student ("李四",12,"B");
        //供给型接口
        Supplier<String> supplier = () -> stu.getName();
        //一下是上面的进一步简写(返回值类型和参数列表要相同)
        //对象::实例方法名
        Supplier<Integer> supplier1 = stu::getAge;
        String name=supplier.get();
        int age =supplier1.get();
        System.out.println(name);
        System.out.println(age);
        System.out.println("--------------");


        //类名::静态方法名
        Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);
        int num =comparator.compare(12,23);
        System.out.println(num);
        Comparator<Integer> comparator1 = Integer :: compare;
        int num1 = comparator1.compare(121,22);
        System.out.println(num1);
        System.out.println("---------");


        //类名::实例方法名
        BiPredicate<String,String> biPredicate = (x,y) -> x.equals(y);
        System.out.println(biPredicate.test("李四", "张三"));
        BiPredicate<String,String> biPredicate1 = String :: equals;
        System.out.println(biPredicate1.test("李四", "张三"));

        //构造器引用
        //数组引用
    }
}
