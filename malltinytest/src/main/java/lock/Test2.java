package lock;

public class Test2 {
//    private volatile static  Test2 INSTANCE;
        private static  Test2 INSTANCE;

    private Test2(){

    }
    //情况一
    public static  Test2 getInstance(){
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
//    情况二  dcl双端锁机制     INCETANCE 被ｖｏｌａｔｉｌｅ修饰

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








    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Test2.getInstance1().hashCode());
            }).start();

        }
    }


}
