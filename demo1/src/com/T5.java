package com;

interface  xxx{
    public  void yyy();

}

enum  Color implements xxx{
    RED,BLACK,BLUE;

    @Override
    public void yyy() {
        System.out.println("xxxxxxxx");
    }
}

public class T5 {


    public static void main(String[] args) {
        Color  t=   Color.RED;
        System.out.println(t);
        Color black = Color.BLACK;
        black.yyy();


    }





}
