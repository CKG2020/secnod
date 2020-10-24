package chapter03生成实例.builder组装复杂实例;

public class Directory {
    private  Builder builder;

    public Directory(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.close();
    }


}
