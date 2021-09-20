package org;

/**
 * @author 小白
 * @create 2021/3/31
 */
public class Person {
    private String name;
    private String sex;
    private Integer age;
    private String idNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Person(String name, String sex, Integer age, String idNo) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idNo = idNo;
    }

    public Person() {
    }
}
