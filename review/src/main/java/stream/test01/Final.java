package stream.test01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import lambda.Test01.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author 小白
 * @create 2021/5/30
 */
public class Final {
    public static void main(String[] args) {
        List<Student> stuList = Arrays.asList(
                new Student("李四",12,"A"),
                new Student("张三",21,"B"),
                new Student("王五",34,"B"),
                new Student("赵六",32,"A")
        );
        //终止max()
        //返回最大年龄
        Integer maxAge = stuList.stream().map(Student::getAge).max(Integer::compare).get();
        //返回一个Optional容器(避免空指针异常)
        //返回年龄总和
        Optional<Integer> optional = stuList.stream().map(Student::getAge).reduce(Integer::sum);
        //先将集合名字提取出来,在将其放入一个新的集合中(collect中参数的接口对象是通过某个类的静态方法创建的)\
        //这里不仅可以返回集合,还可以返回最大,最小值等(分组其他等)(要将toList方法改一下)
        List<String> list =stuList.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(maxAge);
        System.out.println(optional.get());
        list.forEach(System.out::println);
        System.out.println("==========");
        stuList.stream().map(Student::getName).forEach(System.out::println);
        //Student类中写一个静态的compare方法
        //stuList.stream().sorted((x,y) ->Integer.compare(x.getAge(),y.getAge())).map(Student::getName).forEach(System.out::println);
        //stuList.stream().sorted((x,y) -> Student.compare(x,y)).map(Student::getName).forEach(System.out::println);
        System.out.println("=========");


        //分区
        Map<Boolean,List<Student>> map =stuList.stream().collect(Collectors.partitioningBy((x) -> x.getAge()>20));
        System.out.println(map);
        System.out.println("--------------------------");
        //多级分组
        Map<String,Map<String,List<Student>>> map1=stuList.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.groupingBy((x) ->{
            if (x.getAge()<18){
                return "少年";
            }else{
                return "青年";
            }
            })));
        System.out.println(map1);
        //拼接字符串
        String str =stuList.stream().map(Student::getName).collect(Collectors.joining(",","====","===="));
        System.out.println(str);
    }
}
