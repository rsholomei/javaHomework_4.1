package com.geekhub.config;

import com.geekhub.entity.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "com.geekhub")
public class AppConfig {

    @Bean(autowire = Autowire.BY_NAME)
    public SummerTyres summerTyres(){
        return new SummerTyres(17, "Dunlop");
    }

    @Bean(autowire = Autowire.BY_NAME)
    public WinterTyres winterTyres(){
        return new WinterTyres(21, "Bridgestone");
    }

    @Bean
    public Wheel wheel(SummerTyres summerTyres){
        return new Wheel(summerTyres);
    }

    @Bean
    public Wheel wheel_2(WinterTyres winterTyres){
        return new Wheel(winterTyres);
    }

    @Bean
    public Engine engine(){
        return new Engine(1.3);
    }
}
