import Command.Command;
import exception.RedisException;

import procotol.AnalysisInputStream;
import procotol.RedisDecode;

import java.io.*;
import java.net.Socket;

public class MultiThread implements Runnable {
    private Socket socket;

    public MultiThread(Socket socket) {
        this.socket = socket;

    }

    public void run() {
//        while(true){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//                AnalysisInputStream analysisInputStream=new AnalysisInputStream(bufferedReader);
//                String line;
//                while((line=bufferedReader.readLine())!=null){
//                    System.out.println(line);
//                    bufferedWriter.write("+OK\r\n");
//                    bufferedWriter.flush();
//                }
            while (true) {
                Command command = new RedisDecode(bufferedReader, bufferedWriter).command();
                if (command != null) {
                    command.run(bufferedWriter);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (RedisException e) {
            e.printStackTrace();
        }
    }


}
