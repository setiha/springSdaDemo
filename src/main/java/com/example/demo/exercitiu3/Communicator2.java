package com.example.demo.exercitiu3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class Communicator2 {

    @Qualifier("SpecialFile")
    @Autowired
    GenericReader genericReader;

    @Autowired
    ReadOfScanner readOfScanner;

    @Scheduled(fixedDelay = 100 * 60 * 100)
    public void suprimeReader(){
        System.out.println(genericReader.read());
    }
}
