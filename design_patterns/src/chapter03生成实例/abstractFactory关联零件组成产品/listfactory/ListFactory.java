package chapter03生成实例.abstractFactory关联零件组成产品.listfactory;

import chapter03生成实例.abstractFactory关联零件组成产品.factory.Factory;
import chapter03生成实例.abstractFactory关联零件组成产品.factory.Link;
import chapter03生成实例.abstractFactory关联零件组成产品.factory.Page;
import chapter03生成实例.abstractFactory关联零件组成产品.factory.Tray;

public class ListFactory  extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
