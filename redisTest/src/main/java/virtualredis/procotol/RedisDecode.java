package virtualredis.procotol;

import virtualredis.command.Command;
import virtualredis.constant.Constant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RedisDecode {


    private AnalysisInputStream analysisInputStream;
    private BufferedWriter out;
    public RedisDecode(BufferedReader is, BufferedWriter out) {
        this.analysisInputStream = new AnalysisInputStream(is);
        this.out = out;
    }

    public Command command() throws IOException {
        Object process = analysisInputStream.process();
        List<String> list = (List<String>) process;
        String params = list.remove(0);
        String className = null;
        Class<?> cls = null;
        Command command = null;
        if (null == params) {
            RedisEncode.writeError(out, "error command");
            System.out.println("服务端异常");
        } else {
            className= String.format(Constant.COMMAND, params.toUpperCase());
        }
        try{
            cls= Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (null==cls||!Command.class.isAssignableFrom(cls)){
            RedisEncode.writeError(out,"unkown command");
        }
        else {
            try{
                 command = (Command) cls.newInstance();
                 command.params(list);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }


        }
      return  command;

    }


    private class AnalysisInputStream {
        private BufferedReader is;

        public AnalysisInputStream(BufferedReader is) {
            this.is = is;
        }

        public Object process() throws IOException {
            String line = is.readLine();
            if (line.startsWith("*")) {
                String len = line.substring(1);
                return processArray(len);
            } else if (line.startsWith("$")) {
                return processBulkString();
            }
            return null;

        }


        private String processBulkString() throws IOException {
            String s = is.readLine();
            if (s == null || "".equals(s)) {
                return null;
            }
            return s;

        }


        public List<String> processArray(String size) throws IOException {
            int len = Integer.parseInt(size);
            List<String> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                String process = (String) process();
                list.add(process);
            }
            return list;
        }


    }


}
