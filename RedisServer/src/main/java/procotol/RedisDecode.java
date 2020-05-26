package procotol;

import Command.Command;
import exception.RedisException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class RedisDecode {
  private AnalysisInputStream analysis;
  private BufferedWriter out;

    public RedisDecode(AnalysisInputStream analysis, BufferedWriter out) {
        this.analysis = analysis;
        this.out = out;
    }

    public Command command () throws IOException, RedisException {
        String obj=analysis.process();
        List<String> list= Collections.singletonList(obj);
        for (String item:list){

        }
        return  null;
    }

}

