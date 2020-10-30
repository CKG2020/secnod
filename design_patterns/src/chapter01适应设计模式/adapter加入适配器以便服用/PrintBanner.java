package chapter01适应设计模式.adapter加入适配器以便服用;
//适配器
public class PrintBanner extends Banner implements  print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();

    }
}
