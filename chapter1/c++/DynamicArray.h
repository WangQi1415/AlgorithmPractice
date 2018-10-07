#define BASESIZE 10
#define ADDSIZE 5
#include<iostream>
using namespace std;
int size;//存放数组中元素的个数
int capacity;//存放数组的容量
int* a;//尽量少的使用全局变量，而是使用参数传递来完成
//初始化一个数组
void resize();
void insertElement(int index,int e);
void deleElement(int index);
int* initArray(){
    int* a=new int[BASESIZE];
    size=0;
    capacity=10;
    return a;

}

//从头部添加
void addFirst(int e){
    insertElement(0,e);
}
//从尾部添加
void addLast(int e){
   /*if(size<capacity){
        a[size]=e;
        size++;
   }else{
        resize();
        a[size]=e;
        size++;
   }*/
   /*
   if(size==capacity){
        resize();
   }
   a[size]=e;
   size++;
*/
    insertElement(size,e);
}
//删除尾部元素
void deleLast(){
    deleElement(size-1);
}
//删除头部元素
void deleFirst(){
    deleElement(0);
}

//删除 后面的元素覆盖前面的元素
void deleElement(int index){

    //防止用户输入错误，增强代码的健壮性
    if(index<0||index>=size){
        cout<<"请输入合法的数组下标"<<endl;
        return;
    }
    cout<<"dele "<<a[index]<<endl;
    //要考虑最后一个元素
    for(;index<size-1;index++){
        //a[index]=a[++index];//这里自加了两次 bug
        a[index]=a[index+1];
    }
    //元素的总个数减一
    size--;
}
//修改
void changeElement(int index,int e){
    if(index<0||index>=size){
        cout<<"请输入合法的数组下标"<<endl;
        return;
    }
    a[index]=e;
}
//查找 i==size  未找到
int findElement(int e){
    int i;
    for(i=0;i<size;i++){
        if(a[i]==e){
            break;
        }
    }
    return i;
}

//插入
void insertElement(int index,int e){
      /* if(size<capacity){

            //for(int j=size;j>=index;j--){ 这里犯了一个严重的错误  size位置还没有保存值
            for(int j=size;j>index;j--){
                a[j]=a[j-1];
            }
            a[index]=e;
            size++;
        }else{
            resize();
            for(int j=size;j>index;j--){
                a[j]=a[j-1];
            }
            a[index]=e;
            size++;
   }*/
   if(size==capacity){
    resize();
   }
   for(int j=size;j>index;j--){
                a[j]=a[j-1];
            }
            a[index]=e;
            size++;

}

//查看
void viewArray(){
    for(int i=0;i<size;i++){
        cout<<a[i]<<endl;
    }
}
//获取数组的大小
int getSize(){
    return size;
}

//获取容量
int getCapacity(){
    return capacity;
}

//判断数组是否为空
bool isEmpty(){
    return size==0;
}
void resize(){
    cout<<"重新开辟空间"<<endl;
     int *b=new int[capacity+ADDSIZE];
     capacity+=ADDSIZE;
    for(int i=0;i<=size;i++){
            b[i]=a[i];
    }
    delete[] a;
    a=b;
}
/*
可以看见在添加元素 插入元素等 多处都会用到开辟空间的代码 因此可以对其进行封装
*/
/*
int main(){
    a=initArray();
    for(int i=0;i<20;i++){
        addElement(i);

    }
    deleElement(30);
    deleElement(10);
     deleElement(5);
   insertElement(5,100);
   int index=findElement(100);
   if(index<size){
        cout<<"1000 is in"<<" "<<index<<endl;
   }else{
    cout<<"未找到"<<endl;
   }

    //cout<<"capacity="<<getCapacity()<<endl;
    viewArray();
    return 0;
}*/
