import org.omg.PortableServer.THREAD_POLICY_ID;

public class Test extends Thread {

    public void run(){

        while(true){
            System.out.println("我是线程！");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

//            Thread.currentThread().stop();



            Thread.currentThread().suspend();
        }



    }

    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        System.out.println("ok");
    test.resume();


    }


}
