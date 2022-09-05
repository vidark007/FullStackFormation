package com.eazybytes.demo12.config;

import com.eazybytes.demo12.beans.Vehicle;
import com.eazybytes.demo12.implementation.BoseSpeakers;
import com.eazybytes.demo12.interfaces.Speakers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.eazybytes.demo12")
public class ProjectConfig {;

   /* @Bean
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Opel");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }*/

}
