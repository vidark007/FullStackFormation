package com.eazybytes.demo12.implementation;

import com.eazybytes.demo12.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Sony Speakers";
    }
}
