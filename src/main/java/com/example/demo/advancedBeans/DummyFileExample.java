package com.example.demo.advancedBeans;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Configuration
public class DummyFileExample {

   /* @Scheduled(fixedDelay = 1000 * 60 * 10)
    public String fileReadWriteExample() {
        try {
            FileReader reader = new FileReader("src/main/resources/read.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            try {
                String firstLine = bufferedReader.readLine();
                System.out.println(firstLine);
                return firstLine;
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

    }*/
}
