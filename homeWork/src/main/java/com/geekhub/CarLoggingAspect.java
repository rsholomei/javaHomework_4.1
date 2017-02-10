package com.geekhub;

import com.geekhub.entity.Car;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class CarLoggingAspect {
    @Around("execution(* com.geekhub.service.CarService.buildCar(..))")
    public Object logBuildCar(ProceedingJoinPoint joinPoint)throws Throwable{

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss:S");
        System.out.println("Start time: " + dateFormat.format(new Date()));
        Object value = joinPoint.proceed(joinPoint.getArgs());
        System.out.println("Finish time: " + dateFormat.format(new Date()));

        return value;
    }

    @Before("execution(* com.geekhub.service.CarService.testCar(..)))")
    public void logTestCar(JoinPoint joinPoint){
        System.out.println("Input params for test");
        Object[] args = joinPoint.getArgs();
        System.out.println("Args: " + Arrays.toString(args));
    }

    @After("execution(* com.geekhub.service.CarService.detailsAboutCar(..)))")
    public void logDetailsAboutCar(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg == null){
                System.out.println("Car is not ready");
                break;
            }else {
                System.out.println("All details in place");
            }
        }
    }
    @AfterThrowing(
            pointcut = "execution(* com.geekhub.service.CarService.buildCar(..))",
            throwing = "e"
    )
    public void afterThrowing(Throwable e){
        System.out.println(e.getMessage());
    }

    @AfterReturning(
            pointcut = "execution(* com.geekhub.service.CarService.buildCar(..))",
            returning = "car"
    )
    public void afterReturning(JoinPoint joinPoint, Car car) {
        System.out.println("method: " + joinPoint.getSignature().getName());
        System.out.println("return: " + car.toString());
    }

}
