package chapter03生成实例.builder组装复杂实例;

public class Main {
    public static void main(String[] args) {

        TextBuilder textBuilder = new TextBuilder();
        Directory directory = new Directory(textBuilder);
        directory.construct();
        //还得由自己来ｇｅｔ结果
        String result = textBuilder.getResult();
        System.out.println(result);
    }


}
