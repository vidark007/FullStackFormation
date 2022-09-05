package com.eazybytes.demo12.implementation;

import com.eazybytes.demo12.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Michelin Tyres";
    }
}
