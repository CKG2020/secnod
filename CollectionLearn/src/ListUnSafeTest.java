import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListUnSafeTest {
    public static void main(String[] args) {


//            ArrayList<Integer> arrayList = new ArrayList<>();
//            for (int i = 0; i < 20; i++) {
//                arrayList.add(Integer.Of(i));
//            }
//
//            // 复现方法一
//            Iterator<Integer> iterator = arrayList.iterator();
//            while (iterator.hasNext()) {
//                Integer integer = iterator.next();
//                if (integer.intValue() == 5) {
//                    arrayList.remove(integer);
//                }
//            }

        // 复现方法二
//            iterator = arrayList.iterator();
//            for (Integer value : arrayList) {
//                Integer integer = iterator.next();
//                if (integer.intValue() == 5) {
//                    arrayList.remove(integer);
//                }
//            }


//
//        List<Integer> list = new CopyOnWriteArrayList<>();
////        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        for (int a : list
//        ) {
////remove(index )与remove(object o)的区别
//
//            if (a == 4) {
//                list.remove(7);
//                list.remove(3);
//                list.remove(2);
//            }
//        }
//
//        for (int b : list
//        ) {
//            System.out.println(b);
//        }
//
//    }
//}
//解决方法一 :使用iteracor的方法带的remove删除元素
//
//        Iterator<Integer> it_b=list.iterator();
//        while(it_b.hasNext()){
//            Integer a=it_b.next();
//            if (a==4) {
//                it_b.remove();
//            }
//        }
//        for(Integer b:list){
//            System.out.println(b);
//        }

//解决办法二:搞清楚CopyOnWrite的原理   valitail
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.valueOf(i));
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ListIterator<Integer> iterator = list.listIterator();
                while (iterator.hasNext()) {
                    System.out.println("thread1 " + iterator.next().intValue());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (Integer integer : list) {
                    System.out.println("thread2 " + integer.intValue());
                    if (integer.intValue() == 5) {
                        list.remove(integer);
                    }
                }
                for (Integer integer : list) {
                    System.out.println("thread2 again " + integer.intValue());
                }
//                ListIterator<Integer> iterator = list.listIterator();
//                while (iterator.hasNext()) {
//                    Integer integer = iterator.next();
//                    System.out.println("thread2 " + integer.intValue());
//                    if (integer.intValue() == 5) {
//                        iterator.remove();
//                    }
//                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
//}











