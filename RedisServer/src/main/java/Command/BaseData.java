package Command;

import java.util.*;

public class BaseData {

    private static  BaseData ourinstance=new BaseData();

    public static  BaseData    getInstance(){
        return ourinstance;
    }


    private BaseData(){

    }

    public Map<String,String>  string=new HashMap<String, String>();
   public Map<String, List<String>> list=new HashMap<String, List<String>>();
  public Map<String,HashMap<String,String>>  map=new HashMap<String, HashMap<String, String>>();
  public Map<String, Set<String>> set=new HashMap<String, Set<String>>();


public List<String> getList(String key){
    return list.computeIfAbsent(key,k->new ArrayList<String>());

}



}
