package chapter03生成实例.abstractFactory关联零件组成产品.listfactory;

import chapter03生成实例.abstractFactory关联零件组成产品.factory.Tray;

public class ListTray  extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        return "tray";
    }
}
