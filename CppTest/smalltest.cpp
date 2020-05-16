//
// Created by ckg on 20-5-16.
//
#include <iostream>
using namespace std;
//int main(){

//结果都是ab
//    char a[5]={97,98,0,99,100};
//    char *b="ab\0cd";
//    cout<<a<<endl;
//    cout<<b<<endl;



    //        char a[5]={'a','b','\0','c','d'};
//    char *b="ab\0cd";
//    cout<<a<<endl;
//    cout<<b<<endl;

//    return 0;






//    16909060  将十六进制转换为十进制
//    char *ptr=(char *)&a;
//    cout<<*ptr<<endl;
//
//    long *ptr=(long *)&a;
//    cout<<*ptr<<endl;
//    -8995447038791253244
//    return 0;


    //读取十六进制数字的每个字节
//cout<<(long)ptr<<"|"<<(int)*ptr<<endl;
//    ptr++;
//    cout<<(long)ptr<<"|"<<(int)*ptr<<endl;


//
//
//    int b=0x01020304;
//    cout<<b<<endl;   //16909060
//    char c[4]={4,3,2,1};
//    cout<<*(int *)c<<endl;  //16909060  都是这个  大小端的问题
//    cout<<*c<<endl;
//    char *ptr1=(char *)&b;
//    cout<<(int) *ptr1<<endl;
//    return 0;
//
//
//
//}



//int main(){
//    char a[4]={4,3,2,1};
//    cout<<*(int *) a<<endl; // 16909060 巧妙地将数组转换为了十进制的数
//    return 0;
//}
//int main(){
//    int a=0x01020604;//如何理解一次读出来是两位一个int是四字节 然后一个char是一字节  十六进制的数字需要四个bit位来代表一个位置的数字 所以是char类型的指针一次就从十六进制的数字里面读取两位
//    cout<<a<<endl;//打印出的为十进制的数字cout的优化
//    char *ptr=(char *)&a;
////    cout<<*ptr<<endl;
//    cout<<(int)*(ptr+1)<<endl;//将16进制的数字一个读取出来
//    return 0;
//}