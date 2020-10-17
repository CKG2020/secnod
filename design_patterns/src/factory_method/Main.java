package factory_method;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDCardFactory idCardFactory = new IDCardFactory();
        Product p2 = idCardFactory.create("小红");
        List oweners = idCardFactory.getOweners();
        System.out.println(oweners.size());
        Product  p1= idCardFactory.createProduct("小明");
//        p1.use();
//        List oweners = idCardFactory.getOweners();
        System.out.println(oweners.size());
    }
}
