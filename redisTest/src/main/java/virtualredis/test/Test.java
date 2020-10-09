package virtualredis.test;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        String put = objectObjectHashMap.put("a", "xxxx");
        String a = objectObjectHashMap.get("a");

        System.out.println(put);
        System.out.println(a);
    }

}
