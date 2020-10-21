

import com.ckg.gradleFirst.transanctionTest.service.OrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Test1Service.class)
public class Test1Service {
    @Autowired
    private    OrdersService ordersService;
    @Test
    public void testAdd() {
        ordersService.accountMoney();
    }
}
