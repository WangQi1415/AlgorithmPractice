#include"MyStack.h"
#include<iostream>
using namespace std;

int main2(){
    MyStack<char> mystack;
    mystack.push('a');
    mystack.push('b');
    mystack.push('c');
    mystack.push('d');
    mystack.push('e');
    mystack.view();
    while(!mystack.isEmpty()){
        cout<<mystack.pop();
    }

    return 0;
}
