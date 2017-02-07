package com.geekhub.entity;

public class Tyres {
    protected int size;
    protected String name;

    public Tyres(int size, String name){
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tyres size = " + size + ", Tyres name = " + name;
    }
}
