package com.example.demo.exercitiu1;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class Communicator {

    private Greetings greetings;
    private KeyboardReader keyboardReader;

    public Communicator(Greetings greetings) {
        this.greetings = greetings;
    }

    /*@Scheduled(fixedDelay = 1000 * 60)*/
    public void greetings() {
        this.greetings.greetings();

    }
}
