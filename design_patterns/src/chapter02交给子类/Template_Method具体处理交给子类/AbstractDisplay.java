package chapter02交给子类.Template_Method具体处理交给子类;

public abstract class AbstractDisplay {
    public  abstract  void open();
    public  abstract  void print();
    public  abstract  void close();
    //final 不能被子类继承　但是子类可以调用执行并执行子类的各自对应的方法　　//抽象类不同与接口的独特之处
    public  final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
