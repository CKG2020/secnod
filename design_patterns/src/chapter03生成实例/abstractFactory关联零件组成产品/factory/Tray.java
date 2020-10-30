package chapter03生成实例.abstractFactory关联零件组成产品.factory;

import java.util.ArrayList;

public  abstract  class Tray extends  Item {
 protected  ArrayList arrayList=  new ArrayList();




    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        arrayList.add(item);
    }




}
