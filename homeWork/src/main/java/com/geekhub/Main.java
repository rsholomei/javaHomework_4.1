package com.geekhub;

import com.geekhub.config.AppConfig;
import com.geekhub.entity.Car;
import com.geekhub.service.impl.CarServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        CarServiceImpl carService = ctx.getBean(CarServiceImpl.class);
        Car car = carService.buildCar();
        carService.testCar(car);
        carService.detailsAboutCar(car);
    }

}
