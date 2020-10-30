import com.ckg.HelloService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    HelloService helloService;
    @Test
  public  void contextLoads(){
        helloService.sayHello("ckg");

    }
}
