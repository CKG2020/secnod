package virtualredis.command;

import virtualredis.procotol.RedisEncode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class COMMANDCommand implements Command {
    @Override
    public void params(List<String> args) {

    }

    @Override
    public void run(BufferedWriter os) throws IOException {
        System.out.println("redis is ready");
        RedisEncode.writeString(os);

    }
}
