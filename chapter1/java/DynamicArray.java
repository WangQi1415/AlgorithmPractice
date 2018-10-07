package day01;

class DynamicArray {
	private int size;
	//private int capacity; java中可以直接通过 a.length()获得数组的长度
	private int a[];
	
	DynamicArray(){
		this.size=0;
		this.a=new int[10];
	}
	DynamicArray(int len){
		this.size=0;
		this.a=new int[len];
	}
	public void addElement(int e) {
		 if(this.size<this.a.length){
			 //System.out.println("继续添加");
		        this.a[this.size]=e;
		        this.size++;
		        //System.out.println("szie="+this.size);
		   }else{
			   
			 //  throw new IllegalArgumentException("AddLast failed. Array is full.");
			   System.out.println("空间不够");
		        int b[]=new int[this.a.length+5];
		        for(int i=0;i<this.size;i++){
		            b[i]=this.a[i];
		        }
		        b[this.size]=e;
		        this.size++;
		        this.a=b;
		   }
	}
	public void deleElement(int index) {
		if(index<0||index>=size) {
			System.out.println("请输入合法的下标值");
			return;
		}
		 for(;index<=this.size;index++){
		        //a[index]=a[++index];//这里自加了两次 bug
		        this.a[index]=this.a[index+1];
		    }
		    //元素的总个数减一
		    size--;
	}
	public void changeElement(int index,int e) {
		if(index<0||index>=size) {
			System.out.println("请输入合法的下标值");
			return;
		}
		this.a[index]=e;
	}
	public int findElement(int e) {
		
		int i;
		for(i=0;i<=size;i++){
	        if(a[i]==e){
	            break;
	        }
	    }
		return i;
	}
	public void insertElement(int index,int e) {
		if(index<0||index>=size) {
			System.out.println("请输入合法的下标值");
			return;
		}
		 if(this.size<this.size){
	            for(int j=this.size;j>=index;j--){
	                this.a[j+1]=this.a[j];
	            }
	            this.a[index]=e;
	            this.size++;
	        }else{
	            int b[]=new int[this.a.length+5];
	            for(int i=0;i<=this.size;i++){
	                b[i]=this.a[i];
	            }
	            for(int j=this.size;j>=index;j--){
	                b[j+1]=b[j];
	            }
	            this.a[index]=e;
	            this.size++;
	            this.a=b;
	   }
	}
	public int getSize() {
		return this.size;
	}
	public int getCapacity() {
		return this.a.length;
	}
	
	void viewArray(){
	    for(int i=0;i<this.size;i++){
	       System.out.println(this.a[i]);
	    }
	}
	
	
	//判断是否存在某一个元素
	
	//防止用户输入的index非法
	
	
	//删除某个元素的方法
	
	
	
	//复习 Stringbuilder
	
	//java中使用泛型  new一个数组  强转   equals与 ==的区别  toString 的复习   泛型中不能存放 基本数据类型
	
	//删除的时候  最后一个元素还有引用指着  不会被内存回收机制给回收  想要回收 将  data[size]=null 
	
	
	// 比较 java Python中的垃圾回收机制
	
	
	//向其中添加 学生类
	
	
	
	//完善动态地功能
	
	
	//重新开辟一个数组  resize()方法  如果删除元素导致元素非常小的时候  换一个比较小的空间
	
	
	
	//时间复杂度的分析
	/*
	 * O(1)  O(n)....
	 * 
	 * 忽略常数  描述的是渐进时间复杂度
	 * 
	 * O(n)线性时间的算法
	 * T=2*n+2
	 * 
	 * 
	 * T=1*n*n+O   O(n^2)
	 * 
	 * 
	 * 分析各个时间复杂度
	 * 
	 * 添加  O(1)  与数组的规模没有关系
	 * addFirst(e) O(n)
	 * add(index,e)  计算期望  O(n/2)=O(n)
	 * 通常关注的是最糟糕的事情
	 * 
	 * 
	 * resize() O(n)

	 * 
	 * 
	 * 删除操作  同理
	 * 
	 * 修改操作  O(1)
	 * 
	 * 查找操作 
	 * get()  1
	 * contains()  n
	 * find()  n
	 * 
	 *resize()时间复杂度的分析   均摊复杂度
	 *缩容也会导致复杂度震荡的情况
	 *解决方法  lazy的方法
	 * */
	
	
}

