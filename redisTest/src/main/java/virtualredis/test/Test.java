package virtualredis.test;

import org.omg.PortableInterceptor.INACTIVE;
import virtualredis.constant.Constant;

import java.util.HashMap;

public class Test {

    public void test() {
        System.out.println("ccc");

    }
//    public  String test(){
//        System.out.println("sd");
//    }

    public static void main(String[] args) throws Exception {
//        HashMap<String, String> objectObjectHashMap = new HashMap<>();
//        String put = objectObjectHashMap.put("a", "xxxx");
//        String a = objectObjectHashMap.get("a");
//
//        System.out.println(put);
//        System.out.println(a);
//
//
//        String className = String.format(Constant.COMMAND, "set".toUpperCase());
//        System.out.println(className);

        //finally 必执行
        //catch里面没有throw　ｔｒｙ　ｃａｔｃｈ　ｆｉｎａｌｌｙ之外的代码块必执行
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("xxxxx");
        }
//        finally {
        System.out.println("yyyy");
//        }

        Integer integer = new Integer(9);
        Integer integer1 = new Integer(9);
        Long aLong = new Long(9);
        System.out.println(integer.equals(integer1));//ｔｒｕｅ　比较的是内容
        System.out.println(integer.equals(aLong)); //false
        System.out.println(integer.equals(9));//true  integer自动拆箱  equals 与　＝＝一样
        System.out.println(integer == 9);//true
        System.out.println(integer == integer1);//false

        int a = 9;
        System.out.println(a == integer); //true
        System.out.println(integer.equals(a));//true  ｉｎｔ没有ｅｑｕａｌｓ方法　ｉｎｔｅｇｅｒ自动拆箱


        System.out.println("===========================================");
        Integer p = 9;
        Integer q = 9;
        System.out.println(p.equals(q));//ｔｒｕｅ直接赋值　ｉｎｔｅｇｅｒ自动装箱
        System.out.println(p == q);//true　


        Integer x = 200; //integer 直接复制的时候　当付给的数值在［－１２８，１２７］之间的时候．
        // 由于数值缓存在ｉｎｔｇｅｒＣａｃｈｅ里面所以在重新ｎｅｗ相同数值的ｉｎｔｅｇｅｒ对象时，不会重新创建，直接在缓存中拿对象
        //超过时会重新创建
//
        Integer y = 200;
        System.out.println(x.equals(y));//true　　　比较的是内容
        System.out.println(x == y);//false　／／比较的是地址


    }


}
