#define BASESIZE 10
#define ADDSIZE 5
#include<iostream>
using namespace std;
int size;//���������Ԫ�صĸ���
int capacity;//������������
int* a;//�����ٵ�ʹ��ȫ�ֱ���������ʹ�ò������������
//��ʼ��һ������
void resize();
void insertElement(int index,int e);
void deleElement(int index);
int* initArray(){
    int* a=new int[BASESIZE];
    size=0;
    capacity=10;
    return a;

}

//��ͷ�����
void addFirst(int e){
    insertElement(0,e);
}
//��β�����
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
//ɾ��β��Ԫ��
void deleLast(){
    deleElement(size-1);
}
//ɾ��ͷ��Ԫ��
void deleFirst(){
    deleElement(0);
}

//ɾ�� �����Ԫ�ظ���ǰ���Ԫ��
void deleElement(int index){

    //��ֹ�û����������ǿ����Ľ�׳��
    if(index<0||index>=size){
        cout<<"������Ϸ��������±�"<<endl;
        return;
    }
    cout<<"dele "<<a[index]<<endl;
    //Ҫ�������һ��Ԫ��
    for(;index<size-1;index++){
        //a[index]=a[++index];//�����Լ������� bug
        a[index]=a[index+1];
    }
    //Ԫ�ص��ܸ�����һ
    size--;
}
//�޸�
void changeElement(int index,int e){
    if(index<0||index>=size){
        cout<<"������Ϸ��������±�"<<endl;
        return;
    }
    a[index]=e;
}
//���� i==size  δ�ҵ�
int findElement(int e){
    int i;
    for(i=0;i<size;i++){
        if(a[i]==e){
            break;
        }
    }
    return i;
}

//����
void insertElement(int index,int e){
      /* if(size<capacity){

            //for(int j=size;j>=index;j--){ ���ﷸ��һ�����صĴ���  sizeλ�û�û�б���ֵ
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

//�鿴
void viewArray(){
    for(int i=0;i<size;i++){
        cout<<a[i]<<endl;
    }
}
//��ȡ����Ĵ�С
int getSize(){
    return size;
}

//��ȡ����
int getCapacity(){
    return capacity;
}

//�ж������Ƿ�Ϊ��
bool isEmpty(){
    return size==0;
}
void resize(){
    cout<<"���¿��ٿռ�"<<endl;
     int *b=new int[capacity+ADDSIZE];
     capacity+=ADDSIZE;
    for(int i=0;i<=size;i++){
            b[i]=a[i];
    }
    delete[] a;
    a=b;
}
/*
���Կ��������Ԫ�� ����Ԫ�ص� �ദ�����õ����ٿռ�Ĵ��� ��˿��Զ�����з�װ
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
    cout<<"δ�ҵ�"<<endl;
   }

    //cout<<"capacity="<<getCapacity()<<endl;
    viewArray();
    return 0;
}*/
