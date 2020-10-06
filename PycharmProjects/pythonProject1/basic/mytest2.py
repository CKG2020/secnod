
import  json
print("--------------格式化输出------------")
print("aaa{1},bbb{2}".format(1,2,3))
print("---------引入ｊｓｏｎ－－－－－－－－－－－")
a={"aaa":1,"yyy":22}
# 转换为ｊｓｏｎ
print(a)
print(type(a))
b=json.dumps(a)
print(b)
print(type(b))
c=json.loads(b)
print(c)
print(type(c))
# 分支语句 循环语句
a=1
if a==1:
    print("11111111")
elif a==1:
    print("22222")
else:
    print("33333333")
#range 生成器　
for i in range(1,10):
    print(i)
# 默认从０开始　歩长为１
for i in range(10):
    print(i)

for i in range(1,10,2):
    print(i)
print("------------------")
# while循环
i=0
while True:
    print(i)
    i+=1
    if i>9:
        break
print("----------------------")
l= [i for i in range(10)]
print(l)
print(type(l))
print("----------------------")


str1=","
l=[str(i) for i in range(10)]
# 将逗号插入到list中
str2=str1.join(l)
print(str2)
print(type(str2))

# 神奇的ｅｌｓｅ
i=0
while i<10:
    print(i)
    i+=1
else:
    print("zzzzz",i)


    for i in range(10):
        print(i)
        i+=1
    else:
        print("aaaaaaa")
print("------------------------------")
# 函数
def xxx(a,b,c):
    # print()双引号里面的a,b,c为ｋｅｙ，函数调用的时候传进去的为ｖａｌｕｅ
    print("a={},b={},c={}".format(a,b,c))
xxx(c=2,a=1,b=3)
def xxx(a,b):
    print("a={},b={}".format(a,b))
xxx(1,2)
# xxx(1,2,3)  此处会报错　因为Ｐｙｔｈｏｎ不支持方法重载，相同函数名字的函数直接覆盖
# 此处的比Ｊａｖａ重载做的好

def xxx(a,b=1,c=2):
    print("a={},b={},c={}".format(a, b, c))
xxx(a=10,b=29) # 默认已经重载了
#变参函数
print("---------------------------------")
# 第一种形式
def xxx(a,*b):
    print(a)
    print("*"*100)
    print(type(a))
    print(type(b))
xxx(1,2,3,4,5)

# 第二种形式
def xxx(a,**b):
    print(a)
    print("*"*100)
    print(type(a))
    print(b)
    print(type(b))

xxx(1,b=2,c=3,d=4,e=5)

   # 字典(dict)是python中唯一的一个映射类型.他是以{ }括起来的键值对组成. 在dict中key是 唯一的. 在保存的时候, 根据key来计算出一个内存地址. 然后将key-value保存在这个地址中. 这种算法被称为hash算法
#
# 　　已知的可哈希(不可变)的数据类型: int, str, tuple, bool
#
# 　　不可哈希(可变)的数据类型: list, dict, set
#
# 语法 :
#
# 　　{key1: value1, key2: value2....}
#
# 注意: key必须是不可变(可哈希)的. value没有要求.可以保存任意类型的数据
#
# dict保存的数据不是按照我们添加进去的顺序保存的. 是按照hash表的顺序保存的. 而hash表不是连续的. 所以不能进行切片工作. 它只能通过key来获取dict中的数据
# print("--------------------------")
# def   xxx(a,*b,**c):
#     print(a)
#     for  i in b:
#         print(i,"====",b[i])
# # xxx(1,2,5,e=6,d=7)
#
# l=[5,6,7,8]
# m={"g":2,"h":3}
# xxx(1,*l,**m)

# 必须按照顺序赋值
# def xxx(a,b,/,c,d){
#     pass
# }
# xxx(a=2,b=2,c=3,d=3)

# 函数的闭包
# global与nonlocal
print("-------------------------------")
#  nonlocal声明的变量不是局部变量,也不是全局变量,而是外部嵌套函数内的变量
def zzz():
    num=5
    def xxx():
        # nonlocal num
        print("outer1",num)
        def yyy():
            # nonlocal num
            num=20
            print("inner1",num)
        yyy()

    xxx()
    print("outer2",num)
# print(num)
zzz()



print("----------------------------------------")
num=5
def zzz():
    def xxx():
        def yyy():
            # global num
            num=20
            print("inner",num)
        yyy()
    xxx()
    print("outer1",num)
print("outer2",num)
zzz()


#第一行定义了全局变量，在内部函数中又对外部函数进行了引用并修改，
# 那么python会认为它是一个局部变量，有因为内部函数没有对其gcount进行定义和赋值，所以报错。
# gcount = 0
# def global_test():
#     gcount+=1
#     print (gcount)
# global_test()


gcount = 0

def global_test():
    global gcount
    gcount += 1
    print(gcount)

global_test()
# 如果局部不声明全局变量，并且不修改全局变量，则可以正常使用
gcount = 0
def global_test():
    print(gcount)
global_test()

# 迭代器
def zzz():
    pass
print(type(zzz))
# 以上为<class 'function'>

def myadd(a,b):
    return a+b
def mysub(a,b):
    return  a-b
def ops(f,a,b):
    return f(a,b)

print(ops(myadd,1,2))



def incr():
    a=0
    def xxx():
        nonlocal  a
        a+=1
        return a
    return xxx
print(incr())


