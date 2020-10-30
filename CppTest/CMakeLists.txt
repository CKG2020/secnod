cmake_minimum_required(VERSION 3.8)
project(CppTest)

set(CMAKE_CXX_STANDARD 11)

set(SOURCE_FILES main.cpp Father.cpp test.cpp test.h testperson.cpp smalltest.cpp enum.cpp typedefDataType.cpp ref.cpp swap.cpp eryi.cpp c516/Person.cpp memset.cpp test1.cpp ClassLearn/define1.cpp ClassLearn/ztest.cpp ClassLearn/define2.cpp ClassLearn/define3.cpp ClassLearn/define4.cpp ClassLearn/define8.cpp ClassLearn/test.cpp ClassLearn/opt7.cpp ClassLearn/opt8.cpp ClassLearn/yyy.cpp ClassLearn/yyy.h ClassLearn/divide.cpp ClassLearn/divide.h MySqlBulkLoaderDemo.cpp MySqlBulkLoaderDemo.h)
add_executable(CppTest ${SOURCE_FILES})