package lock;

import builder.Test;

public class Test2 {
//    //此处为饿汗模型
//    private  static  final  Test2 incetance=new Test2();
//    public static Test2 getIncetance0(){
//        return  incetance;
//    }






    private volatile static  Test2 INSTANCE;
//        private static  Test2 INSTANCE;


    //下面前两种均为懒汉模型
    private Test2(){

    }
    //情况一  书上说的是不可以的　但是方法上上面加ｓｙｎｃ一定可以保证单利　
    public static    Test2 getInstance(){
        if (INSTANCE==null){
            synchronized (Test2.class){
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE=new Test2();
            }
        }
        return INSTANCE;
    }
//    情况二  dcl双端锁机制     INCETANCE 被ｖｏｌａｔｉｌｅ修饰　　防止指令重排空初始化

    public static  Test2 getInstance1(){
        if (INSTANCE==null){
            synchronized (Test2.class){
                if (INSTANCE==null)
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE=new Test2();
            }
        }
        return INSTANCE;
    }





//    静态内部类实现 单例模式
    private static class SingleTonBuilder {
        private static Test2 singleTon = new Test2();
    }


    public static Test2 getInstance3() {
        return SingleTonBuilder.singleTon;
    }


    //情况４

    static {
        INSTANCE=new Test2();
    }

    public static Test2 getInstance4(){
        return INSTANCE;
    }




    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Test2.getInstance1().hashCode());
            }).start();

        }
//下面是使用饿汗模型
//        Test2 a = Test2.getIncetance0();
//        Test2 b= Test2.getIncetance0();
//        System.out.println(a==b);

    }


}
