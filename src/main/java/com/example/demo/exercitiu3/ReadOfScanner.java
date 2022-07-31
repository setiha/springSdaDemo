package com.example.demo.exercitiu3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ReadOfScanner implements GenericReader {
    @Override
    public String read() {
        return "Read of Scanner";
    }
}
