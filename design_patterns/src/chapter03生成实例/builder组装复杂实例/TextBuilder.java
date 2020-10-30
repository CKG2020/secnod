package chapter03生成实例.builder组装复杂实例;

public class TextBuilder  extends  Builder{
   private  StringBuffer  buffer=   new  StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("------------");
        buffer.append("["+title+"]");
        buffer.append("-------------");

    }

    @Override
    public void close() {
    buffer.append("==============");
    }

    public  String getResult(){
        return buffer.toString();
    }
}
