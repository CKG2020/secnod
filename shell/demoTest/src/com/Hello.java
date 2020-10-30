package com;

public class Hello {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            // 每两秒打印一次日志
            Thread.sleep(2000);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 打印日志
                    System.out.println("com.Hello World!!");
                }
            }).start();
        }


    }
}
