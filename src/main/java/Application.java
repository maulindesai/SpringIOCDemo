import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

class Application {

    public static void main(String[] args) {
//        ApplicationContext=new ClassPathXmlApplicationContext("")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("person.xml");
        Person person=applicationContext.getBean("person", Person.class);

        System.out.println(person);

    }

}