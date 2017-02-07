package com.geekhub.entity;

public class SummerTyres extends Tyres{

    public SummerTyres(int size, String name){
        super(size, name);
    }

    @Override
    public String toString() {
        return String.format("Summer tyres:\n" + "Tyres size = " + size + ", Tyres name = " + name);
    }
}
