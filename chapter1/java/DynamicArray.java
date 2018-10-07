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
		        //System.out.println("size="+this.size);
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
	

	
}

