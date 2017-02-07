package com.geekhub.service;

import com.geekhub.entity.Car;

public interface CarService {
    Car buildCar();
    void testCar(Car car);
    void detailsAboutCar(Car car);
}
