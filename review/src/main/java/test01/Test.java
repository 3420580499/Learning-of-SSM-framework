package test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Person person = new Person("zs", 20, new Address("江西南昌", "中山大道"));
		String fileName = "D:\\maven\\review\\p.xml";
		SerializeTool.Serialized(person, fileName);
		Person person2 = SerializeTool.deSerialize(fileName, new Person());
		System.out.println(person2.toString());
		System.out.println("==========");

	}
}