package com.example.demo.exercitiu1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greetings {

    @Autowired
    KeyboardReader keyboardReader;
    public void greetings(){
        System.out.println("Hi. I am Dory! Who are You");
        System.out.println("Type here your name");
        this.keyboardReader.keyboardReader();
    }
}
