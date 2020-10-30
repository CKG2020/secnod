package com.demo.i1;

public class DrawTest {
    public static void main(String[] args) {

        Account account = new Account(10000, "爸爸");
        DrawThread mama = new DrawThread("妈妈", account, 300);
        DrawThread son = new DrawThread("儿子", account, 500);
        DrawThread mama1 = new DrawThread("妈妈", account, 300);
        DrawThread son1 = new DrawThread("儿子", account, 500);

        DrawThread mama2 = new DrawThread("妈妈", account, 300);
        DrawThread son2 = new DrawThread("儿子", account, 500);
        mama.start();
        son.start();
mama1.start();
son1.start();
mama2.start();
son2.start();

    }

}
