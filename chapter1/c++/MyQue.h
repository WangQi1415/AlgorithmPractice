#include"DynamicArrayT.h"
#include<iostream>
using namespace std;

template<class T>
class MyQue{
private:
    DynamicArrayT<T> myarray;
public:
    void push(T t){
        myarray.addLast(t);
    }
    T pop(){
        return myarray.deleFirst();
    }
    bool isEmpty(){
        return myarray.isEmpty();
    }
    void view(){
        myarray.viewArray();
    }
};
