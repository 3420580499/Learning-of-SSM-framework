package com.good.dao;

import com.good.entity.OtherStudent;
import com.good.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 小白
 * @create 2021/2/8
 */
//接口操作student表
public interface StudentDao {
    //查询Student表中所有数据
    List<Student> selectStudents();
    //插入方法
    //参数:student,表示要插入到数据库的数据
    //返回值:int,表示执行insert操作后的影响数据库的行数
    int  insertStudent(Student student);
    /**
     * 一个简单的参数:
     * 简单类型:mybatis把java的基本数据类型和String都叫做简单类型
     * 在mapper文件获取简单类型的一个参数的值,使用#{任意字符}
     */
    Student selectStudentById(Integer id);
    /**
     * 多个参数:命名参数,在形参定义的前面加入 @param("自定义参数名称")
     */
    List<Student> selectMulitParam(@Param("myname") String name,
                                          @Param("myage") Integer age);

    //定义方法返回Map
    Map<Object,Object> returnMap(Integer id);

    //使用resultMap定义映射关系
    List<Student> selectAllStudent();

    //(当数据库列名与属性名不一致时)查询student表赋值给OtherStudent类(会得到很多空的OtherStudent对象)
    //第一种解决方案(使用resultMap)(推荐使用)
    List<OtherStudent> selectOtherStudent();
    //第二种解决方案(使用resultMap:同名的列值赋值给同名的属性)(修改数据库列的别名)
    List<OtherStudent> selectOtherStudentTwo();


    //第一种模糊查询(在java代码中指定like的内容)
    List<Student> selectLikeStudent(String name);
    //第二种模糊查询(在mapper中拼接like)
    List<Student> selectLikeStudentTwo(String name);

}




















