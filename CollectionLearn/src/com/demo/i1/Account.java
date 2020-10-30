package com.demo.i1;

public class Account {
    private double account_sum;
    private  String accountId;

    public Account(double account_sum, String accountId) {
        this.account_sum = account_sum;
        this.accountId = accountId;
    }

    public double getAccount_sum() {
        return account_sum;
    }

    public void setAccount_sum(double account_sum) {
        this.account_sum = account_sum;
    }

    public String getaccountId() {
        return accountId;
    }

    public void setaccountId(String accountId) {
        this.accountId = accountId;
    }


    public  void draw(String name,double take){
        if (take<=account_sum){
            System.out.println(name+"取出了"+take+"元");
            account_sum-=take;
            System.out.println(this.getaccountId()+"账户余下的额度为"+account_sum);
        }
        else {
            System.out.println(this.getaccountId()+"余下的额度不足");
        }
    }
}
