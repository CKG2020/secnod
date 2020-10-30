package chapter03生成实例.prototype复制生成实例;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
//        Product product = manager.create("xxx");
//        manager.register();
        MessageBox messageBox = new MessageBox('~');
        Product clone = messageBox.createClone();
//        clone.use();
        manager.register("xxx",clone);
        Product product = manager.create("xxx");
        product.use("yyyy");

    }
}
