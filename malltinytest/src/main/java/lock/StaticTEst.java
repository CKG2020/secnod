package lock;

public class StaticTEst {

        static{
            System.out.println("静态代码块");
        }
//    静态代码块: static{}
//    加载一次,
//    加载早于非静态,早于对象的创建,随着类的加载而加载
//    多个静态代码块按顺序执行
//    只能对于静态的属性进行赋值

    {
        System.out.println("构造代码块");
    }
        public StaticTEst(){
            System.out.println("无参构造函数");
        }

        public void sayHello(){
            {
                System.out.println("普通代码块");
            }
        }

        public static void main(String[] args) {
            System.out.println("执行了main方法");

            new StaticTEst().sayHello();;
            System.out.println("---------------");
            new StaticTEst().sayHello();;
        }
    }

