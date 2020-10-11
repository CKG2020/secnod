package virtualredis.command;

import virtualredis.BaseData;
import virtualredis.procotol.RedisEncode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SETCommand implements Command {
    private List<String> params;
    @Override
    public void params(List<String> args) {
        this.params=args;

    }

    @Override
    public void run(BufferedWriter os) throws IOException {
        if (2==params.size()){
            String key = params.remove(0);
            String value = params.remove(0);
            Map<String, String> string = BaseData.getInstance().string;
            String put = string.put(key, value);
            if (null==put){
                RedisEncode.writeString(os);

            }

        }

    }
}