#include"DynamicArrayT.h"
#include<iostream>
using namespace std;

template<class T>
class MyStack{
    DynamicArrayT<T> myarray;

    //栈功能的实现

public:
     //1 进栈
    void push(T t){
        myarray.addLast(t);
    }
    //2 出栈
    T pop(){
        T t=myarray.deleLast();
        return t;
    }
    //3.判空
    bool isEmpty(){
        return myarray.isEmpty();
    }
    void view(){
        myarray.viewArray();
    }
};
