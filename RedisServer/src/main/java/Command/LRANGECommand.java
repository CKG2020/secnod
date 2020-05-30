package Command;

import procotol.RedisEncode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LRANGECommand implements Command {

    private List<String> params;
    @Override
    public void params(List<String> args) {
        this.params=args;

    }

    @Override
    public void run(BufferedWriter os) throws IOException {


        if (3==params.size()){
            String key = params.remove(0);
            String value1= params.remove(0);
            int start_index = Integer.parseInt(value1);
            String value2 = params.remove(0);
            int end_index = Integer.parseInt(value2);

            List<String> list2 = BaseData.getInstance().getList(key);
//            Map<String, List<String>> map = BaseData.getInstance().list;
//            ArrayList<String> list = (ArrayList<String>) map.get(key);
            List<String> list3 = list2.subList(start_index, end_index);
           if (list3!=null){
               RedisEncode.writeArray(os,list3);
//  RedisEncode.writeInteger(os,"ok");
           }

        }

        else{
            RedisEncode.writeError(os,"the list does not exist!!");
        }

    }
}