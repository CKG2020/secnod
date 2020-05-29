package Command;

import procotol.RedisEncode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RPOPCommand implements Command {
    private  List<String> params;
    @Override
    public void params(List<String> args) {
        this.params=args;

    }

    @Override
    public void run(BufferedWriter os) throws IOException {
    if (1==params.size()){
        String key = params.remove(0);
        Map<String, List<String>> map = BaseData.getInstance().list;
        ArrayList<String> list = (ArrayList<String>) map.get(key);
        int size = list.size();
        String remove = list.remove(size - 1);
        if (list!=null){
            RedisEncode.writeString(os);

        }

    }

    else{
        RedisEncode.writeError(os,"the list does not exist!!");
    }

    }



    }

