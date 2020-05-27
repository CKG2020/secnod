import java.util.*;

//public class Test {
//    public static void main(String[] args) {
//      List<Integer> list=new ArrayList<>();
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//
//        /*for (Integer i=0; i<list.size(); i++) {
//            if (list.get(i) % 2 == 0) {　　　　　　　　
//                list.remove(i);   //执行删除指定位置的元素的功能     执行结果　[11,12,13,14,15,16]
//            }
//        }*/
////        for (int i=0; i<list.size(); i++) {
////            if (list.get(i) % 2 == 0) {
//           int a=  list.remove(2);   //执行删除指定元素的功能          执行结果　[11,13,15]
////            }
////        }
////        for(Integer i : list){
////            System.out.println(i);
////        }
//        System.out.println(a);
//    }
//
//    }
//


public class Test {
    public static void main(String[] args) {
        HashMap users = new HashMap();
      String a= (String) users.put("11", "张浩太"); // 将学生信息键值对存储到Map中
     String b= (String) users.put("11", "刘思诚");
        users.put("33", "王强文");
        users.put("44", "李国量");
        users.put("55", "王路路");
        System.out.println(a);
        System.out.println(b);
//        System.out.println("******** 学生列表 ********");
//        Iterator it = users.keySet().iterator();
//        while (it.hasNext()) {
//            // 遍历 Map
//            Object key = it.next();
//            Object val = users.get(key);
//            System.out.println("学号：" + key + "，姓名:" + val);
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入要删除的学号：");
//        int num = input.nextInt();
//        if (users.containsKey(String.valueOf(num))) { // 判断是否包含指定键
//            users.remove(String.valueOf(num)); // 如果包含就删除
//        } else {
//            System.out.println("该学生不存在！");
//        }
//        System.out.println("******** 学生列表 ********");
//        it = users.keySet().iterator();
//        while (it.hasNext()) {
//            Object key = it.next();
//            Object val = users.get(key);
//            System.out.println("学号：" + key + "，姓名：" + val);
//        }
    }
}