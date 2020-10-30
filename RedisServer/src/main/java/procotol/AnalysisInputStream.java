package procotol;

import exception.RedisException;

import java.io.BufferedReader;
import java.io.IOException;

public class AnalysisInputStream{
    private BufferedReader is;

    public AnalysisInputStream(BufferedReader is) {
        this.is = is;
    }

    public String process() throws IOException, RedisException {
        StringBuffer buffer;
        String line;
        while(null!=(line=is.readLine())){
            if (!line.startsWith("*")&&!line.startsWith("$")){

                buffer=new StringBuffer();
                buffer.append(line.trim());
                return buffer.toString();
            }
            throw new RedisException(">>>>client is close!!!");

        }

        return null;
    }
}