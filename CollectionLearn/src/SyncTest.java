

class  A{

    public void f1(B b) throws InterruptedException {

        System.out.println(Thread.currentThread().getName()+"A类");


        Thread.sleep(200);



        b.f4();

    }


    public void f2() {
        System.out.println("A类内部方法");
    }
}



class  B{

    public void f3(A a) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"A类");
        Thread.sleep(200);
        a.f2();
    }

    public void f4() {
        System.out.println("B类内部方法");
    }
}


public class SyncTest  implements  Runnable {

    SyncTest syncTest=new SyncTest();

    A a;
    B b;

    @Override
    public void run() {



    }









}
