package test4;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test4.User;

public class Manager {
        public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


            User user = (User) applicationContext.getBean("p1");

            PrintInfo printInfo = (PrintInfo) applicationContext.getBean("printInfo");                 //获取Bean
        printInfo.PrintUser();//输出JavaBean的属性值
    }
}