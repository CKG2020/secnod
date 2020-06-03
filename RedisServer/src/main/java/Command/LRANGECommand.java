package Command;

import procotol.RedisEncode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LRANGECommand implements Command {
    private List<String> params;
    private int start;
    private int end;

    @Override
    public void params(List<String> args) {
        this.params=args;

    }

    @Override
    public void run(BufferedWriter os) throws IOException {


//        if (3==params.size()){
//            String key = params.remove(0);
//            String value1= params.remove(0);
//            int start_index = Integer.parseInt(value1);
//            String value2 = params.remove(0);
//            int end_index = Integer.parseInt(value2);
//
//            List<String> list2 = BaseData.getInstance().getList(key);
////            Map<String, List<String>> map = BaseData.getInstance().list;
////            ArrayList<String> list = (ArrayList<String>) map.get(key);
//            List<String> list3 = list2.subList(start_index, end_index);
//           if (list3!=null){
//               RedisEncode.writeArray(os,list3);
////  RedisEncode.writeInteger(os,"ok");
//           }
//
//        }
//
//        else{
//            RedisEncode.writeError(os,"the list does not exist!!");
//        }
//
//    }

        if (3 == params.size()) {
            String key = params.remove(0);
            List<String> baseData = BaseData.getInstance().getList(key);
            start = Integer.parseInt(params.remove(0));
            end = Integer.parseInt(params.remove(0));
            List<String> list = new ArrayList<>();
            try {
                if (start >= 0 && start < baseData.size()) {
                    if (end < 0) {
                        end = baseData.size() + end;
                        for (int i = end; i < baseData.size(); i++) {
                            list.add(baseData.get(i));
                        }
                        RedisEncode.writeArray(os, list);
                    } else {
                        if (end >= baseData.size()) {
                            RedisEncode.writeArray(os, baseData);
                        } else {
                            for (int i = start; i < end + 1; i++) {
                                list.add(baseData.get(i));
                            }
                            RedisEncode.writeArray(os, list);
                        }
                    }
                } else {
                    for (int i = baseData.size() + start; i < baseData.size(); i++) {
                        list.add(baseData.get(i));
                    }
                    RedisEncode.writeArray(os, baseData.subList(baseData.size() + start, baseData.size()));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else {
            try {
                RedisEncode.writeError(os, "ERR wrong number of arguments for 'lrange' command");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
