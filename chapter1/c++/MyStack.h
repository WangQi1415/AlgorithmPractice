#include"DynamicArrayT.h"
#include<iostream>
using namespace std;

template<class T>
class MyStack{
    DynamicArrayT<T> myarray;

    //ջ���ܵ�ʵ��

public:
     //1 ��ջ
    void push(T t){
        myarray.addLast(t);
    }
    //2 ��ջ
    T pop(){
        T t=myarray.deleLast();
        return t;
    }
    //3.�п�
    bool isEmpty(){
        return myarray.isEmpty();
    }
    void view(){
        myarray.viewArray();
    }
};
