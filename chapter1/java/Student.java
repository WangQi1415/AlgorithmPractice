package day01;

class Student {

	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.getName()+this.getAge();
	}
/*@Override
此处只是为了测试出现冲突的时候的解决方案
	public String toString() {
		return this.getName()+this.getAge();
	}
*/

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student stu=(Student)obj;
			return this.equals(stu);
			}else {
				return false;
			}
		
	}
	public String testGitflict() {
		return "this is wangqi1415!!!"
		
	}
}
