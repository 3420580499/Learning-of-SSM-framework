package com.review.extend;

/**
 * @author 小白
 * @create 2021/6/23
 */
public class B extends A {
    private String type;

    public B(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    /*public B (){
        super();
    }*/

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        System.out.println(this.getName()+this.getAge());
        return "B{" +
                "type='" + type + '\'' +
                '}';
    }
    public String show(){
        return super.show()+this.getType();
    }
    public void dute(){
        System.out.println("子类特有的方法");
    }
}
