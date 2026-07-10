package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    public String getOwnerName() {
        return "Lucky";
    }
    public int getSpeed() {
        return 95;
    }
    public void cdplayer() {
        System.out.println("CD Player Facility Available");
    }
}