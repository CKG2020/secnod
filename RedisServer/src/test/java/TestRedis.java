import java.io.IOException;

public class TestRedis {
    public static void main(String[] args) {
  RedisServer server=new RedisServer();
  try{
      server.init(10000);

  }
  catch(IOException e){

      e.printStackTrace();
  }
    }
}
