package com.geekhub.entity;

public class Wheel {
    protected Tyres tyres;

    public Wheel(Tyres tyres){
        this.tyres = tyres;
    }

    @Override
    public String toString(){
        return tyres.toString();
    }
}
