package com.demo.i1;

public class DrawThread extends Thread {
    private Account account;
    private double take;
    private String name;
    public DrawThread( String name, Account account, double take) {
        this.name=name;
        this.account = account;
        this.take = take;
    }
    public void run(){
        account.draw(name,take);

    }


}
