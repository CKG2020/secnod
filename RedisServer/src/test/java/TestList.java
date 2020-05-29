import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        System.out.println("list 集合中的元素数量：" + list.size());
        System.out.println("list 集合中的元素如下：");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "、");
        }
        List sublist = new ArrayList();
        sublist = list.subList(2, 5); // 从list集合中截取索引2~5的元素，保存到sublist集合中
        System.out.println("\nsublist 集合中元素数量：" + sublist.size());
        System.out.println("sublist 集合中的元素如下：");
        it = sublist.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "、");
        }

        String remove = (String) sublist.remove(3);
        System.out.println();
        System.out.println(remove);


    }
}
