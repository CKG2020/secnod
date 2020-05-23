//
// Created by ckg on 20-5-22.
//
//
//

#include<iostream>
using namespace std;
#define _DEBUG_
int define3(){
    int x=10;
#ifdef _DEBUG_
    cout<<"File:"<< __FILE__<<",Line:"<< __LINE__<<",x:"<<x<<endl;
    cout<<__FUNCTION__<<endl;
#else
    printf("x = %d\n", x);
       cout<<x<<endl;
#endif
    return 0;
}