package factory_method;
//工厂模式是对template_method的进一步使用　
public  abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;

    }

//    protected  abstract  Product createProduct(String owner);
//    protected  abstract void registerProduct(Product product);
    protected  abstract  Product createProduct(String owner);
    protected  abstract void registerProduct(Product product);
    //abstrat 方法不能用ｐｒｉｖａｔｅ来修饰
}
