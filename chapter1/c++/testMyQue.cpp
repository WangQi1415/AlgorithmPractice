#include"MyQue.h"
#include<iostream>
using namespace std;
int main(){
    //ʵ���Ƚ��ȳ�
    MyQue<char> mq;
    mq.push('a');
    mq.push('b');
    mq.push('c');
    mq.push('d');
    mq.view();
    while(!mq.isEmpty()){
        cout<<mq.pop();
    }

}
