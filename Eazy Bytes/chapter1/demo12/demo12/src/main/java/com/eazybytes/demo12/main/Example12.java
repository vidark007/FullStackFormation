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

        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);

        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        person.getVehicle().getVehicleService().playMusic();
        vehicle.getVehicleService().setSpeakers(new BoseSpeakers());
        System.out.println(person.getName());
        vehicle.getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();

    }
}
