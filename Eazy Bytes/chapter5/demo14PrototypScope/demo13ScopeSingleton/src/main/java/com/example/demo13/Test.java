package com.example.demo13;

import com.example.demo13.config.PersonConfig;
import com.example.demo13.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);

        person1.setName("First");
        System.out.println("Person 1 :" + person1.getName() + " " + person1.hashCode());
        System.out.println("Person 2 :" + person2.getName() +" " + person2.hashCode());
        person2.setName("Second");
        System.out.println("Person 1 :" + person1.getName());
        System.out.println("Person 2 :" + person2.getName());
    }
}
