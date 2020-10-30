package virtualredis;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RedisServer {
    private int port;

    public void init(int port) throws IOException {
        this.port=port;
        run();
    }


    private void run() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("wait connection**********");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (true){
            Socket accept = serverSocket.accept();
            System.out.println("client connection successfully*******");
            executorService.execute(new MultiThread(accept));
        }


    }






}
