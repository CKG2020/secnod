package chapter03生成实例.prototype复制生成实例;

import java.util.HashMap;

public class Manager {
    private HashMap showcase=new HashMap();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String  productName){
         Product product = (Product)showcase.get(productName);
         return product.createClone();
    }
}
