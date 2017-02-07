package com.geekhub.entity;

public class Car {
    protected Wheel wheel;
    protected Engine engine;

    public Car(Wheel wheel, Engine engine){
        this.wheel = wheel;
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheel + " Engine: " + engine;
    }

}
