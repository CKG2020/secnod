package virtualredis;

import java.util.*;

public class BaseData {

    private static BaseData ourinstance = new BaseData();

    public static BaseData getInstance() {
        return ourinstance;
    }

    public BaseData() {

    }

    public Map<String, String> string = new HashMap<>();
    public Map<String, List<String>> list = new HashMap<>();
    public Map<String,HashMap<String,String>> map=new HashMap<>();
    public Map<String, Set<String>>  set=new HashMap<>();

    public List<String> getList(String key){
        return  list.computeIfAbsent(key,k->new ArrayList<String>());

    }

}
