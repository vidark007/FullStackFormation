package com.eazybytes.demo12.implementation;

import com.eazybytes.demo12.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Bose Speakers";
    }
}

