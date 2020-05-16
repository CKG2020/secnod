//
// Created by ckg on 20-5-16.
//
#include <iostream>
using namespace std;
double add(double a, int b) {
    return a + b;
}

double sub(double a, int b) {
    return a - b;
}
//自定义数据类型
typedef double (*function)(double ,int);
typedef char * myString;
//int main(){
//    myString str="abc";   //使用function关键字
//    cout<<str<<endl;
//    function  f;
//    f=add;
//    cout<<f(1,2)<<endl;
//    f=sub;
//    cout<<f(1,2)<<endl;
//    return 0;

//
//    double  (*ptr)(double ,int);//使用函数指针
//    ptr=add;
//    cout<<ptr(3.1,2)<<endl;


//}