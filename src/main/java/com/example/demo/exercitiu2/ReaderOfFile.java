package com.example.demo.exercitiu2;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ReaderOfFile {
    public String readLine() {
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
    }
}
