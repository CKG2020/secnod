//
// Created by ckg on 20-7-7.
//

#include "yyy.h"
#include <iostream>
using namespace std;
int xxx(int num,char args[]){
    int length=sizeof(args)/sizeof(args[0]);
    for (int i = 0; i <length ; ++i) {
        cout<<args[i]<<endl;

    }

}
int main(){
    char args[]={'a','c'};
    char *a=args;
    xxx(2,a);




}