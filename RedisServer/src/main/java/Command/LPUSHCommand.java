package Command;

import procotol.RedisEncode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LPUSHCommand implements Command {
    private List<String> params;
    @Override
    public void params(List<String> args) {
        this.params=args;

    }

    @Override
    public void run(BufferedWriter os) throws IOException {
        if(2==params.size()){

//           boolean flag = false;
            String key=params.remove(0);
            String value=params.remove(0);
            Map<String, List<String>> map = BaseData.getInstance().list;
            List<String> list1 = new ArrayList<String>();

//            flag=key;
//            System.out.println(flag);
//            int count=0;



//
//            if (false==flag) {
//
//                list1.add(value);
//                List<String> put = map.put(key, list1);
//
//                if (null==put){
//                    RedisEncode.writeString(os);
//                }
//            }
////            flag=true;
//
//            else {

             list1 = map.get(key);
                list1.add(value);
                List<String> put = map.put(key, list1);
                if (null==put){
                    RedisEncode.writeInteger(os,String.valueOf(list1.size()));
                }

            }




        }
    }

