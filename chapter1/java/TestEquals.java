package day01;

public class TestEquals {
	public static void main(String args[]) {
		/*
		 * ==比较的是地址，即比较的对象是否指向同一块地址
		 * equals 比较的是内容，即两个对象是否完全相同
		 * "Hello World 字符串常量，是放在常量区，因此abc与 xyz指向的是同一块地址"
		 * str1,str2是在堆区new出来的两块不同的内存空间，因此==返回false
		 * */
		String abc = "Hello World";
		String xyz = "Hello World";
		
		String str1=new String("Hello World");
		String str2=new String("Hello World");

		if(abc == xyz)
		    System.out.println("Refers to same string");
		else
		    System.out.println("Refers to different strings");

		if(abc.equals(xyz))
		     System.out.println("Contents of both strings are same");
		else
		     System.out.println("Contents of strings are different");
		
		if(str1==str2) {
			System.out.println("str1==str2");
		}
		if(str1==abc) {
			System.out.println("str1==abc");
		}
		if(str1.equals(abc)) {
			System.out.println("str1.equals(abc)");
		}
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		}
	}
}
