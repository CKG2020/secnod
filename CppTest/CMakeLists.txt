cmake_minimum_required(VERSION 3.8)
project(CppTest)

set(CMAKE_CXX_STANDARD 11)

set(SOURCE_FILES main.cpp Father.cpp test.cpp test.h testperson.cpp smalltest.cpp enum.cpp typedefDataType.cpp ref.cpp swap.cpp eryi.cpp c516/Person.cpp)
add_executable(CppTest ${SOURCE_FILES})