package chapter01适应设计模式.adapter加入适配器以便服用;

public class Mian {
    public static void main(String[] args) {

        PrintBanner hello = new PrintBanner("hello");

        hello.showWithAster();
        hello.showWithParen();
    }
}
