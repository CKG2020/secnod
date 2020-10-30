package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test2.User;

public class Manager {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Resource resource = new ClassPathResource();            //装载配置文件
//        BeanFactory factory = new XmlBeanFactory(resource);

        User user = (User) applicationContext.getBean("user1");                                    //获取Bean
//        System.out.println("用户姓名——"+user.getName());//输出用户的姓名
//        System.out.println("用户年龄——"+user.getAge());//输出用户的年龄
//        System.out.println("用户性别——"+user.getSex());//输出用户的性别
        user.printInfo();//输出JavaBean的属性值
    }
}