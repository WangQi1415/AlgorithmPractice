package day01;


/*
 * 采用泛型实现动态数组
 * java中的泛型
 * */
class DynamicArrayE<E>{
	private int size;
	//private int capacity; java中可以直接通过 a.length()获得数组的长度
	private E[] a;
	
	
	DynamicArrayE(int len){
		this.size=0;
		this.a=(E[])new Object[len];
	}
	DynamicArrayE(){
		//this.size=0;
		//this.a=new E[10];
		//this.a=(E[])new Object[10];
		this(10);
	}

	public void addLast(E e) {
		this.insertElement(this.size, e);
	}
	
	public void resize(int newCapacity) {
		E[] b=(E[])new Object[newCapacity];
		for(int i=0;i<this.size;i++) {
			b[i]=a[i];
		}
		this.a=b;
	}
	public E deleElement(int index) {
		E e=this.a[index];
		if(index<0||index>=size) {
			System.out.println("请输入合法的下标值");
			return null;
		}
		 for(;index<this.size-1;index++){
		        this.a[index]=this.a[index+1];
		    }
		 this.a[size]=null;//最后一个元素的索引置为空，使得垃圾回收机制可以回收它
		 size--;
		 return e;
	}
	public E deleLast() {
		return this.deleElement(this.getSize()-1);
	}
	public E deleFirst() {
		return this.deleElement(0);
	}
	public void changeElement(int index,E e) {
		if(index<0||index>=this.size) {
			System.out.println("请输入合法的下标值");
			return;
		}
		this.a[index]=e;
	}
	public int findElement(E e) {
		
		int i;
		for(i=0;i<=size;i++){
	        if(a[i].equals(e)){
	            break;
	        }
	    }
		return i;
	}
	public void insertElement(int index,E e) {
		if(index<0||index>this.size) {
			/*
			 * System.out.println("请输入合法的下标值");
			 * return;
			 */
			throw new IllegalArgumentException("Insert faild,index>0&&index>=size");
		}
		/*
		if(this.size<this.a.length){
	            for(int j=this.size;j>index;j--){
	                this.a[j]=this.a[j-1];
	            }
	            this.a[index]=e;
	            this.size++;
	        }else{
	            E b[]=(E[])new Object[this.a.length+5];
	            for(int i=0;i<=this.size;i++){
	                b[i]=this.a[i];
	            }
	            for(int j=this.size;j>index;j--){
	                b[j]=b[j-1];
	            }
	            this.a[index]=e;
	            this.size++;
	            this.a=b;
	            
	           垃圾的代码  代码冗余
	           1、不用开辟空间  插入
	           2、用开辟空间  插入   插入的逻辑自己写了两遍
	           3、开辟空间的逻辑多次使用的  封装到一个方法中更好 
	   }*/
		if(this.size==a.length) {
			resize(2*a.length);
		}
		for(int j=this.size;j>index;j--){
            this.a[j]=this.a[j-1];
        }
		a[index]=e;
		this.size++;

		
	}
	//在尾部插入
	public void addFirst(E e) {
		this.insertElement(0, e);
	}
	public int getSize() {
		return this.size;
	}
	public int getCapacity() {
		return this.a.length;
	}
	public boolean isEmpty() {
		return this.size==0;
	}
	void viewArray(){
	    for(int i=0;i<this.size;i++){
	       System.out.println(this.a[i]);
	    }
	}
	

}
