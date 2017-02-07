package com.geekhub.entity;

public class WinterTyres extends Tyres {

    public WinterTyres(int size, String name){
        super(size, name);
    }

    @Override
    public String toString() {
        return "Winter tyres: \n" + "Tyres size = " + size + ", Tyres name = " + name;
    }
}
