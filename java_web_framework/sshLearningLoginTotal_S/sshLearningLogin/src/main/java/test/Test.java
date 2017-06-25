package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by kinthon on 17-6-22.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        TestService ts= (TestService)ac.getBean("testService");
        ts.hello();
    }
}
