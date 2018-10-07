#define BASESIZE 10
#define ADDSIZE 5
#include<iostream>
using namespace std;
template<class T>
class DynamicArrayT{
 private:
    int size;
    int capacity;
    T* a;
 public:
    DynamicArrayT(){
        this->a=new T[BASESIZE];
        this->size=0;
        this->capacity=10;
    }
    DynamicArrayT(int capacity){
        this->a=new T[capacity];
        size=0;
        this->capacity=capacity;
    }
    void addLast(T t){
       insertElement(size,t);
    }
    void addFirst(T t){
        insertElement(0,t);
    }

    //删除 后面的元素覆盖前面的元素
    T deleElement(int index){

    //防止用户输入错误，增强代码的健壮性
        T t=a[index];
        if(index<0||index>=this->size){
            cout<<"请输入合法的数组下标"<<endl;
            return -1;
        }
            for(;index<this->size-1;index++){
                //a[index]=a[++index];//这里自加了两次 bug
                a[index]=a[index+1];
            }
            //元素的总个数减一
           this->size--;
           return t;
        }
    T deleFirst(){
       T t= deleElement(0);
       return t;
    }
    T deleLast(){
       T t= deleElement(size-1);
       return t;
    }
        //修改
      void changeElement(int index,T t){
            if(index<0||index>=this->size){
                cout<<"请输入合法的数组下标"<<endl;
                return;
            }
            this->a[index]=t;
        }
        //查找
       int findElement(T t){
            int i;
            for(i=0;i<size;i++){
                if(a[i]==t){
                    break;
                }
            }
            return i;
        }

        //插入
       void insertElement(int index,T t){
               if(this->size<capacity){

                    //for(int j=size;j>=index;j--){ 这里犯了一个严重的错误  size位置还没有保存值
                    for(int j=this->size;j>index;j--){
                        a[j]=a[j-1];
                    }
                    a[index]=t;
                    this->size++;
                }else{
                    this->resize();
                    for(int j=this->size;j>index;j--){
                        this->a[j]=this->a[j-1];
                    }
                    this->a[index]=t;
                    this->size++;
           }
        }

        //查看
        void viewArray(){
            for(int i=0;i<this->size;i++){
                cout<<a[i]<<endl;
            }
        }
        //获取数组的大小
        int getSize(){
            return this->size;
        }

        //获取容量
        int getCapacity(){
            return this->capacity;
        }

        //判断数组是否为空
       bool isEmpty(){
            return this->size==0;
        }
       void resize(){
            cout<<"重新开辟空间"<<endl;
            T *b=new T[capacity+ADDSIZE];
            capacity+=ADDSIZE;
            for(int i=0;i<=size;i++){
                b[i]=a[i];
            }
            delete[] this->a;
            this->a=b;
        }

        //在析构函数中释放为数组开辟的空间
        ~DynamicArrayT(){
            delete[] this->a;
        }
};

