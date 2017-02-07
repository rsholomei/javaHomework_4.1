package com.geekhub.service.impl;

import com.geekhub.entity.Car;
import com.geekhub.entity.Engine;
import com.geekhub.entity.Wheel;
import com.geekhub.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    Wheel wheel;

    @Autowired
    Engine engine;

    @Override
    public Car buildCar() {
        System.out.println("Building a car");
        return new Car(wheel, engine);
    }

    @Override
    public void testCar(Car car){
        if(car != null){
            System.out.println("Car build right");
        }else {
            System.out.println("Car build not right");
        }
    }

    @Override
    public void detailsAboutCar(Car car) {
        try {
            System.out.printf("Car consist of: \n"+
                    "Wheels: " + "\n" + car.getWheel()+"\n" +
                    "Engine: " + "\n" + car.getEngine());
        }catch (NullPointerException e){
            System.out.println("Car is not built");
        }
    }
}
