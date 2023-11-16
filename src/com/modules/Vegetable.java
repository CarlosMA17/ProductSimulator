package com.modules;

public class Vegetable {
    private String name;
    private String farmer;

    public Vegetable(String name, String farmer) {
        this.name = name;
        this.farmer = farmer;
    }

    public String getName() {
        return name;
    }

    public String getFarmer() {
        return farmer;
    }
}
