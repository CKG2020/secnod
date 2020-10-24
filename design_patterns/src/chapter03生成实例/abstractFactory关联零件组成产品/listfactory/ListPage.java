package chapter03生成实例.abstractFactory关联零件组成产品.listfactory;

import chapter03生成实例.abstractFactory关联零件组成产品.factory.Page;

public class ListPage  extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return "page";
    }
}
