package chapter03生成实例.abstractFactory关联零件组成产品.listfactory;

import chapter03生成实例.abstractFactory关联零件组成产品.factory.Link;

public class ListLink  extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "link";
    }
}
