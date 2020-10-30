public class PuTong {
    public PuTong(){
        System.out.print("默认构造方法！-->");
    }

    //非静态代码块
    {
        System.out.print("非静态代码块！-->");
    }

    //静态代码块
    static{
        System.out.print("静态代码块！-->");
    }

    public static void test(){
        {
            System.out.println("普通方法中的代码块！");
        }
    }
}

