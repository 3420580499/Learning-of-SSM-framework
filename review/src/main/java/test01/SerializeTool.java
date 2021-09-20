package test01;

import java.io.*;
import java.lang.reflect.*;

public class SerializeTool{
	public static void Serialized(Object obj, String fileName)
	{
		File file = new File(fileName);
		StringBuilder stringbuilder = new StringBuilder();
		try (FileOutputStream output = new FileOutputStream(file))
		{
			stringbuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");//XML文件的开头
			toXML(stringbuilder,obj,"\t");
			output.write(stringbuilder.toString().getBytes());//将stringbuilder的内容写入XML文件
			output.close();
			System.out.println("序列化成功！");
		}catch(Exception e){
		}
	}
	public static <T>T deSerialize(String fileName, T t) //反序列化，第二个参数为一个对象的实例，用来识别需要生成的对象的类型，与返回值类型相同
	{
		File file = new File(fileName);
		try (FileInputStream input = new FileInputStream(file))
		{
			StringBuilder stringbuilder = new StringBuilder();
			byte[] b = new byte[1024];
			int len = -1;
			while((len = input.read(b)) != -1)//将XML文件的内容存入字节数组
			{
				stringbuilder.append(new String(b, 0, len));//将字节数组的内容存入stringbuilder
			}
			System.out.println(stringbuilder.toString());
			stringbuilder.delete(stringbuilder.indexOf("<"), stringbuilder.indexOf(">") );//删除XML文件的第一行内容
			T obj = XMLto(stringbuilder);//用XML文件的内容创建对象
			input.close();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static <T>T XMLto(StringBuilder stringbuilder) throws Exception
	{
		String className = stringbuilder.substring(stringbuilder.indexOf("<") + 1, stringbuilder.indexOf(">"));//获取类名
		stringbuilder.delete(stringbuilder.indexOf("<"), stringbuilder.indexOf(">") + 1);//在stringbuilder中删除类类型的的开始标识
		stringbuilder.delete(stringbuilder.lastIndexOf("</"), stringbuilder.lastIndexOf(">") + 1);//在stringbuilder中删除类类型的的结束标识
		Class<T> clazz = (Class<T>) Class.forName(className);//反射机制使用类名获取Class对象
		Constructor<T> constructor = clazz.getDeclaredConstructor();//使用Class对象创建constructor对象那个
		T obj = constructor.newInstance();//调用无参数的构造方法创建对应对象
		String packageName = clazz.getPackage().getName();//获取包名
		Field[] fields = clazz.getDeclaredFields();//获取属性
		for (Field field : fields)
		{
			String fieldName = field.getName();
			char ch= (char) ((fieldName.toCharArray())[0]-32);
			String fName="" + ch + fieldName.substring(1);//属性名，开头大写
			String fieldType = field.getType().getName();//获取属性的类型
			int i = ("<"+fieldName+">").length();//开始标识的长度
			String value = stringbuilder.substring(stringbuilder.indexOf("<"+fieldName+">") + i,
					stringbuilder.indexOf("</"+fieldName+">"));//取开始标识与结束标识中间的字符串，即基础数据类型的值
			stringbuilder.delete(stringbuilder.indexOf("<"), stringbuilder.indexOf(">") + 1);//删除开始标识
			if(fieldType.contains(packageName))//是否为基础数据类型
			{
				stringbuilder.delete(stringbuilder.lastIndexOf("</"), stringbuilder.lastIndexOf(">") + 1);//删除类类型的结束标识
				Method method = clazz.getDeclaredMethod("set" + fName, Class.forName(fieldType));
				method.setAccessible(true);
				method.invoke(obj, (Object)XMLto(stringbuilder));//递归调用XMLto,并调用setter方法
			}
			else
			{
				stringbuilder.delete(stringbuilder.indexOf("</"), stringbuilder.indexOf(">") + 1);//删除基础数据类型的结束标识
				Method method = clazz.getDeclaredMethod("set" + fName, Class.forName(fieldType));
				method.setAccessible(true);
				method.invoke(obj, transformation(value, field.getType()));//反射机制调用setter方法
			}
		}
		return obj;
	}
	public static <T>T transformation(String string, Class<T> type)//利用反射机制将字符串类型转化为指定的数据类型，只能是类类型
	{
		T value = null;
		try {
			Constructor<T> constructor = type.getConstructor(String.class);
			constructor.setAccessible(true);
			value = constructor.newInstance(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	public static void toXML(StringBuilder stringbuilder, Object obj, String preBank) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
	{
		Class<?> clazz = obj.getClass();
		stringbuilder.append(preBank + "<" + clazz.getName() + ">\n");
		String packageName = clazz.getPackage().getName();//获取包名
		Field[] fields = clazz.getDeclaredFields();//获取属性
		String Bank = preBank+"\t";//每次嵌套多一个缩进字符
		for (Field field : fields)
		{
			String fieldName = field.getName();//获取属性名
			char ch= (char) ((fieldName.toCharArray())[0]-32);
			String fName="" + ch + fieldName.substring(1);//属性名，开头大写
		    String fieldType = field.getType().getName();//获取属性的类型
			Method method = clazz.getDeclaredMethod("get" + fName); //调用getter方法
			if(fieldType.contains(packageName))//是否是基础数据类型
			{
				stringbuilder.append(Bank + "<" + fieldName + ">\n");//类类型的开始标识
				toXML(stringbuilder, method.invoke(obj), Bank + "\t");//递归调用
				stringbuilder.append(Bank + "</" + fieldName + ">\n");//类类型的结束标识
			}
			else
			{
				String attrValue=method.invoke(obj).toString();
				stringbuilder.append(Bank + "<" + fieldName + ">" + attrValue + "</" + fieldName + ">\n");//基础数据类型
			}
		}
		stringbuilder.append(preBank + "</"+clazz.getName()+">\n");//类的结束标识
	}
}