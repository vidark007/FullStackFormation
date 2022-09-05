package com.eazybytes.demo12.main;

import com.eazybytes.demo12.beans.Person;
import com.eazybytes.demo12.beans.Vehicle;
import com.eazybytes.demo12.config.ProjectConfig;
import com.eazybytes.demo12.implementation.BoseSpeakers;
import com.eazybytes.demo12.interfaces.Speakers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context");
    }
}
