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

    //ɾ�� �����Ԫ�ظ���ǰ���Ԫ��
    T deleElement(int index){

    //��ֹ�û����������ǿ����Ľ�׳��
        T t=a[index];
        if(index<0||index>=this->size){
            cout<<"������Ϸ��������±�"<<endl;
            return -1;
        }
            for(;index<this->size-1;index++){
                //a[index]=a[++index];//�����Լ������� bug
                a[index]=a[index+1];
            }
            //Ԫ�ص��ܸ�����һ
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
        //�޸�
      void changeElement(int index,T t){
            if(index<0||index>=this->size){
                cout<<"������Ϸ��������±�"<<endl;
                return;
            }
            this->a[index]=t;
        }
        //����
       int findElement(T t){
            int i;
            for(i=0;i<size;i++){
                if(a[i]==t){
                    break;
                }
            }
            return i;
        }

        //����
       void insertElement(int index,T t){
               if(this->size<capacity){

                    //for(int j=size;j>=index;j--){ ���ﷸ��һ�����صĴ���  sizeλ�û�û�б���ֵ
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

        //�鿴
        void viewArray(){
            for(int i=0;i<this->size;i++){
                cout<<a[i]<<endl;
            }
        }
        //��ȡ����Ĵ�С
        int getSize(){
            return this->size;
        }

        //��ȡ����
        int getCapacity(){
            return this->capacity;
        }

        //�ж������Ƿ�Ϊ��
       bool isEmpty(){
            return this->size==0;
        }
       void resize(){
            cout<<"���¿��ٿռ�"<<endl;
            T *b=new T[capacity+ADDSIZE];
            capacity+=ADDSIZE;
            for(int i=0;i<=size;i++){
                b[i]=a[i];
            }
            delete[] this->a;
            this->a=b;
        }

        //�������������ͷ�Ϊ���鿪�ٵĿռ�
        ~DynamicArrayT(){
            delete[] this->a;
        }
};

