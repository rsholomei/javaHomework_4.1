package com.geekhub.entity;

public class Engine {
    protected double engineСapacity;

    public Engine(double engineСapacity){
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "EngineCapacity: " + engineСapacity;
    }
}
