import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BaseData {

    private static  BaseData ourinstance=new BaseData();
    public static  BaseData    getInstance(){
        return ourinstance;
    }


    private BaseData(){

    }

    private Map<String,String>  string=new HashMap<String, String>();
    private Map<String, List<String>> list=new HashMap<String, List<String>>();
    private Map<String,HashMap<String,String>>  map=new HashMap<String, HashMap<String, String>>();
    private Map<String, Set<String>> set=new HashMap<String, Set<String>>();

}
