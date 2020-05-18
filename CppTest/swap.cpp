//
// Created by ckg on 20-5-16.
//

#include<iostream>
#include<stdlib.h>
using namespace std;

void swap_int(int *a,int *b)
{
    int *temp=a;
    a=b;
    b=temp;
}

void test(int *p)
{
    int a=1;
    p=&a;
    cout<<p<<" "<<*p<<endl<<endl;;
}
//int main(void)
//{
//    int a=1,b=2;
//    int *p=NULL;
//    swap_int(&a,&b);
//    cout<<a<<" "<<b<<endl;
//    cout<<&a<<endl;
//
//    test(p);
//    if(p==NULL)
//        cout<<"指针p为NULL"<<endl<<endl;
//    system("pause");
//}