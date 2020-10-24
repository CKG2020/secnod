package chapter02交给子类.Template_Method具体处理交给子类;

public class CharDisPlay extends  AbstractDisplay {
    private  char ch;

    public  CharDisPlay(char ch){
        this.ch=ch;
    }
    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
