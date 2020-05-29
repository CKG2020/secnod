//public class Test implements Runnable{
//    private String name;
//    //    private static MethodSync methodSync = new MethodSync();
//    private MethodSync methodSync = new MethodSync();
//
//    public Test(String name){
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        methodSync.method(name);
//    }
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new Test("test 1"));
//        Thread t2 = new Thread(new Test("test 2"));
//        t1.start();
//        t2.start();
//    }
//}


///测试类
public class Test{

    /**
     * 区别两次new静态与非静态代码块执行情况
     */
    public static void main(String[] args) {
        PuTong c1 = new PuTong();
        c1.test();

        PuTong c2 = new PuTong();
        c2.test();
    }
}