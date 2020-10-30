package chapter01适应设计模式.adapter加入适配器以便服用;

//２００福特电源
public class Banner {
    private  String string;
    public Banner(String string){
        this.string=string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public  void showWithAster(){
        System.out.println("*"+string+"*");
    }



}
