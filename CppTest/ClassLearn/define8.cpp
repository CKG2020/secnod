//
// Created by ckg on 20-5-23.
//

//#include<iostream>
//using namespace std;
//
//int define8()
//{
//    cout << "Current File: " << __FILE__ << endl; //Current File: /opt/testio-cpp/clang/define8.cpp
//    cout << "Current Line: " << __LINE__ << endl; //Current Line: 7
//#line 1000 "wrongfile"
//    cout << "Current File: " << __FILE__ << endl; //Current File: wrongfile
//    cout << "Current Line: " << __LINE__ << endl; //Current Line: 1001
//    return 0;
//}







//#include<iostream>
//using namespace std;
//
//#define myplusB(a,b) myplusA(a,b)
//
//int myplusA(int a,int b){
//    return a+b;
//}
//
//int define8(){
//    int c=myplusB(1,2);
//
//    cout<<c<<endl;
//    return 0;
//}





#include<iostream>
using namespace std;
int define8(){
    const int a=1;

    enum weather{sunny=10,cloudy,rainy=10,windy};
    cout<<windy<<endl;
    /*其中sunny=0,cloudy=1,rainy=2,windy=3,
    默认地，第一个枚举子被赋值为0*/
    enum fruits{apple=6,orange,banana=7,bear};
    /*也可以显式地赋值，接下来的枚举子取值是前面一个枚举子的取值+1，即orange=4，bear=8*/
//	cout<<bear<<endl;
//    enum big_cities{guangzhou=1,shenzhen=3, beijing=1,shanghai=2};
    /*同一枚举中的枚举子的取值不需要唯一*/
    weather w=sunny;
    int w1=1;
    switch (w){
        case sunny:cout<<"xxx"<<endl;
        case cloudy:
            break;
    }

//    const int sunny1=1;
//    int i=sunny1;
//
//    switch(i){
//        case sunny1:
//            break;
//
//    }

    return 0;
}
