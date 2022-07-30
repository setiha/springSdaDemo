package com.example.demo.exercitiu2;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ReaderOfKeyBoard {
    Scanner s = new Scanner(System.in);
    public String readLine() {

        String text = s.nextLine();
        return text;
    }

}
