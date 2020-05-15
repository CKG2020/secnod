//
// Created by ckg on 20-5-16.
//

#include "test.h"



#include <iostream>
#include "test.h"

using namespace std;

test::test()
{
    cout << "创建了一个新的对象！" << endl;
}

void test::say()
{
    cout << "大家好，我叫" << name << ",性别" << sex << ",今年" << age << "岁." << endl;
}