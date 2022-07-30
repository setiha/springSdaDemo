package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class Scheduler {
    @Autowired
    PrettyPrinter pp;

    private UglyPrinter uglyPrinter;

    private NotSoPrettyPinter notSoPrettyPinter;

    public Scheduler(NotSoPrettyPinter notSoPrettyPinter) {
        this.notSoPrettyPinter = notSoPrettyPinter;
    }

    /*@Scheduled(fixedDelay = 1000 * 60 * 10) //secunde minute*/
    public void every10Minutes() {
        System.out.println("Am ajuns aici");
        pp.prettyPinter();
        notSoPrettyPinter.NotSoPrettyPinter();
        uglyPrinter.uglyPrint();
    }

    @Autowired
    public void setUglyPrinter(UglyPrinter uglyPrinter) {
        this.uglyPrinter = uglyPrinter;
    }

}
