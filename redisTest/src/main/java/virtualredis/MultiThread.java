package virtualredis;

import virtualredis.command.Command;
import virtualredis.procotol.RedisDecode;

import java.io.*;
import java.net.Socket;

public class MultiThread implements Runnable {
    private Socket socket;

    public MultiThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                Command command = new RedisDecode(bufferedReader, bufferedWriter).command();
                if (command != null) {
                    command.run(bufferedWriter);
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
