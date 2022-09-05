package com.eazybytes.demo12.implementation;

import com.eazybytes.demo12.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "Bridge Stone Tyres";
    }
}
