import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


//数组和数组链表的大小的不同衡量方式
        List<Integer> list=new ArrayList<>(10);
        list.add(1);
        for (int a:list
             ) {
            System.out.println(a);
        }

        System.out.println(list.size());    //打印出的值为0  add 一个元素size+1

        System.out.println("=======================================");


        int a[]=new int [10];

//        int a[0]=1;
        for ( int b:
                a
             ) {
            System.out.println(b);

        }
        System.out.println(a.length);//初始化的时候几个元素 length就是几
    }
}
