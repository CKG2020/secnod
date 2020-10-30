//
// Created by ckg on 20-5-23.
//

#include<stdio.h>
#include <iostream>
using namespace std;
#define add(a,b) { \
    a+b \
}
//????????
int define4() {
#define TO_LITERAL(text) TO_LITERAL_(text)//TO_LITERAL_(201103L)
#define TO_LITERAL_(text) #text //201103L

#ifndef __cplusplus
    /* this translation unit is being treated as a C one */
        printf("a C program\n");
#else
    /*this translation unit is being treated as a C++ one*/
    printf("a C++ program\n__cplusplus expands to \""
                   TO_LITERAL(__cplusplus) "\"\n");//TO_LITERAL_(201103L)-->"201103L"
    //TO_LITERAL_(__cplusplus)-->"__cplusplus"
#endif

//    int c=add(1,2);
//
//    int c1={
//            1+2
//    };
//
//
//    cout<<c<<endl;


    return 0;
}