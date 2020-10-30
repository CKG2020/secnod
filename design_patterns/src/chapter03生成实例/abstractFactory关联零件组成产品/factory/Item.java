package chapter03生成实例.abstractFactory关联零件组成产品.factory;

public  abstract class Item {
    protected  String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract  String makeHTML();
}
