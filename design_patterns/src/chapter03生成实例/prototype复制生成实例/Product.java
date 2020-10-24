package chapter03生成实例.prototype复制生成实例;
//此处为原型模式
public interface Product  extends Cloneable {
    //cloneable 接口　　ｃｌｏｎｅ方法内部处理是分配与要复制的对象同样的内存　　将要复制的实例字段的内容复制到所分配的内存里面　
    public abstract  void use(String a);
    public abstract  Product  createClone();
}
