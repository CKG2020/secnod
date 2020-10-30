package chapter03生成实例.abstractFactory关联零件组成产品;

import chapter03生成实例.abstractFactory关联零件组成产品.factory.Factory;
import chapter03生成实例.abstractFactory关联零件组成产品.factory.Link;
import chapter03生成实例.abstractFactory关联零件组成产品.factory.Page;
import chapter03生成实例.abstractFactory关联零件组成产品.factory.Tray;

public class Main {
    public static void main(String[] args) {
//        if (args.length!=0){
//            System.out.println("Usage:java Main class.name.of.ConcreteFactory");
//            System.out.println("Example 1:java Main  chapter03生成实例.abstractFactory.listfactory.ListFactory");
//            System.exit(0);
//        }
        Factory factory = Factory.getFactory("chapter03生成实例.abstractFactory.listfactory.ListFactory");
        Link link = factory.createLink("xxx", "link");

        Tray tray = factory.createTray("tray");
        tray.add(link);
        factory.createPage("zzz","ckg");

        Page page = factory.createPage("zzz", "ckg");
        page.add(link);
        page.add(tray);
        page.output();
//        System.out.println(args);

    }
}
