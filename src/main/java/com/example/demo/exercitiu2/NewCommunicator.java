package com.example.demo.exercitiu2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class NewCommunicator {


    public NewCommunicator(ReaderOfFile readerOfFile, ReaderOfKeyBoard readerOfKeyBoard) {
        this.readerOfFile = readerOfFile;
        this.readerOfKeyBoard = readerOfKeyBoard;
    }

    private ReaderOfFile readerOfFile;


    private ReaderOfKeyBoard readerOfKeyBoard;


    @Scheduled(fixedDelay = 1000 * 60)
    public void readerBoth() {
        String a = readerOfFile.readLine();
        String b = readerOfKeyBoard.readLine();
        System.out.println(a);
        System.out.println(b);
    }
}

