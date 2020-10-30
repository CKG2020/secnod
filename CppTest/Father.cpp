//
// Created by ckg on 20-5-16.
//
#include <iostream>
#include <langinfo.h>


//virtual 解释Java的 父子继承方法的使用 方法重载的原理
class Father{
   public:
   virtual  void xxx(){
        std::cout << "father" << std::endl;
//        cout<<"father"<<endl;

    }
};
class Son:public  Father{
public:
    void xxx(){
//
        std::cout << "son" << std::endl;
    }
};
//int main(){
//    Father *s=new Son();
//    s->xxx();
//    return 0;
//}