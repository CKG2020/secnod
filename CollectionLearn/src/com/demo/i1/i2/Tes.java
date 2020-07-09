package com.demo.i1.i2;

class A {
}
public class Tes extends Thread {
    private A a;
    private  static  int sum=0;
    public Tes(A a) {
        this.a = a;
    }
    public void run() {
        dosomething();
    }

    public void dosomething() {
        for (int i = 0; i < 1000; i++) {
            synchronized (a){
                sum++;
            }
        }
    }
 public  int dis(){
        return sum;
 }

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        for (int i = 0; i < 10; i++) {
            Tes tes = new Tes(a);
            tes.start();
        }
        Thread.sleep(10000);

        System.out.println(sum);
    }

}
