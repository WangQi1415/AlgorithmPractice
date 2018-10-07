package day01;

public class Main {
	public static void main(String args[]) {
		
		//整型数组测试
		System.out.println("整型数组测试");
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

		//泛型测试
		System.out.println("泛型测试");
		DynamicArrayE<String> myarray1=new DynamicArrayE<String>(20);
		myarray1.addLast("aaa");
		myarray1.addLast("bbb");
		myarray1.addLast("ccc");
		myarray1.insertElement(2, "ddd");
		myarray1.viewArray();

		//学生类测试
		DynamicArrayE<Student> myarray2=new DynamicArrayE<Student>(20);
		Student stu1=new Student("zhangsan",18);
		Student stu2=new Student("lisi",19);
		Student stu3=new Student("wangwu",21);
		myarray2.addLast(stu1);
		myarray2.addLast(stu2);
		myarray2.addLast(stu3);
		myarray2.viewArray();
		myarray2.insertElement(2, new Student("zhaoliu",16));
		//myarray.viewArray();//重写类的toString方法
		
		System.out.println("删除："+myarray2.deleElement(3));
		myarray.viewArray();
		
		
		//栈功能的测试
		System.out.println("栈功能的测试");
		MyStack<Integer> mystack=new MyStack<Integer>();
		
		for(int i=0;i<6;i++) {
			mystack.push(i);
		}
		while(!mystack.isEmpty()) {
			System.out.println(mystack.pop());
		}
		
		//队列功能测试
		System.out.println("队列功能的测试");
		MyDeque<Integer> mydeque=new MyDeque<Integer>();
		
		for(int i=0;i<6;i++) {
			mydeque.push(i);
		}
		while(!mydeque.isEmpty()) {
			System.out.println(mydeque.pop());
		}
	}
}
