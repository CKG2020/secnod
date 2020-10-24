package chapter03生成实例.abstractFactory关联零件组成产品.factory;

public  abstract  class Link  extends  Item{
  protected  String  url;
    public Link(String caption,String url) {
        super(caption);
        this.url=url;

    }
}
