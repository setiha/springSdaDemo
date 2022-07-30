package com.example.demo.exercitiu3;

import org.springframework.stereotype.Component;

@Component
public class ReadOfScanner implements GenericReader {
    @Override
    public String read() {
        return "Read of Scanner";
    }
}
