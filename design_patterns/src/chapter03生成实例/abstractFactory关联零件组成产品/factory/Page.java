package chapter03生成实例.abstractFactory关联零件组成产品.factory;

import java.util.ArrayList;

public     abstract  class Page {
    protected  String title;
    protected  String author;
    protected ArrayList content=new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public  void add(Item item){
        content.add(item);
    }

    public  void output(){
        System.out.println("Page xxx");
        String s = this.makeHTML();
        System.out.println(s);
    }

    public abstract  String makeHTML();
}
