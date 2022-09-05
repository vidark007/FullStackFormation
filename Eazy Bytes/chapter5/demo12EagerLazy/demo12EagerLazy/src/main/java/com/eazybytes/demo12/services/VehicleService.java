package com.eazybytes.demo12.services;

import com.eazybytes.demo12.interfaces.Speakers;
import com.eazybytes.demo12.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class VehicleService {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }
    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
