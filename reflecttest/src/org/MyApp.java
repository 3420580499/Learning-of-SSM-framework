package org;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author 小白
 * @create 2021/3/31
 */
public class MyApp {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("D:\\maven\\reflecttest\\person.java");
        Class clazz = Class.forName("org.Person");
        StringBuilder builder = new StringBuilder();
        builder.append("package "+clazz.getPackage().getName()+";"+"\n");
        builder.append("public class Person {"+"\n");
        Field fields [] =clazz.getDeclaredFields();
        for(Field field:fields){
            builder.append("    "+Modifier.toString(field.getModifiers()));
            builder.append(" "+field.getType().getSimpleName());
            builder.append(" "+field.getName()+";"+"\n");
        }
        Method methods [] =clazz.getDeclaredMethods();
        for (Method method :methods){
            builder.append("    "+Modifier.toString(method.getModifiers()));
            builder.append(" "+method.getReturnType().getSimpleName());
            builder.append(" "+method.getName());
            builder.append("(");
            Class[] classes=method.getParameterTypes();
            for (Class cls:classes){
                builder.append(cls.getSimpleName()+" "+get(method));
            }

            builder.append(")"+"\n");
        }
        builder.append("\n"+"}");
        out.write(builder.toString().getBytes());
        out.flush();
        out.close();
    }
    public static  String get(Method method){
        StringBuilder sb=new StringBuilder();
        Parameter [] parameters =method.getParameters();
        for(Parameter para:parameters){
            sb.append(para.getName()+" ");
        }
        return sb.toString();
    }
}
