package virtualredis.procotol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class RedisEncode {
    public static  void writeInteger(BufferedWriter writer,String len) throws IOException {
        writer.write(":");
        writer.write(String.valueOf(len));
        writer.write("\r\n");
        writer.flush();
    }

    public static  void writeString(BufferedWriter writer) throws IOException {
        writer.write('+');
        writer.write("OK");
        writer.write("\r\n");
        writer.flush();
    }


    public  static  void writeBulkString(BufferedWriter writer,String str) throws IOException {

        writer.write('$');
        writer.write("OK");
        writer.write("\r\n");
        writer.write(str);
        writer.write("\r\n");
        writer.flush();
    }

    public static void writeError(BufferedWriter writer,String message) throws IOException {
        writer.write('-');
//        writer.write("(error)");
//       writer.write("\t");
        writer.write(message);
        writer.write("\r\n");
        writer.flush();

    }



}
