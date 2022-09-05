package com.example.demo13.config;

import com.example.demo13.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example.demo13")
public class PersonConfig {

    @Bean
    @Scope("singleton")
    public Person personBean(){
        return new Person();
    }
}
