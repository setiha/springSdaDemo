package com.example.demo.exercitiu3;

import org.springframework.stereotype.Component;



@Component("SpecialFile")
public class ReadOfFile implements GenericReader {
    @Override
    public String read() {
        return "Read of file";
    }
}
