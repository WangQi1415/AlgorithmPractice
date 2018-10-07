package day01;

public class Main {
	public static void main(String args[]) {
		/*
		 
		DynamicArray myarray=new DynamicArray(10);
		myarray.addElement(10);
		myarray.deleElement(30);
		myarray.viewArray();
		int len=myarray.getSize();
		System.out.println(len);
		for(int i=0;i<20;i++) {
			myarray.addElement(i);
		}
		myarray.viewArray();
			 */
		/*
		DynamicArrayE<String> myarray=new DynamicArrayE<String>(20);
		myarray.addElement("aaa");
		myarray.addElement("bbb");
		myarray.addElement("ccc");
		myarray.insertElement(2, "ddd");
		myarray.viewArray();
		*/
		
		DynamicArrayE<Student> myarray=new DynamicArrayE<Student>(20);
		Student stu1=new Student("zhangsan",18);
		Student stu2=new Student("lisi",19);
		Student stu3=new Student("wangwu",21);
		myarray.addLast(stu1);
		myarray.addLast(stu2);
		myarray.addLast(stu3);
		
		myarray.insertElement(2, new Student("zhaoliu",16));
		//myarray.viewArray();//重写类的toString方法
		
		myarray.deleElement(3);
		myarray.viewArray();
		
	}
}
