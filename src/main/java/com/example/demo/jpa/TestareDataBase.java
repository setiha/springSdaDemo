package com.example.demo.jpa;

import com.example.demo.jpa.entity.Student;
import com.example.demo.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Configuration
public class TestareDataBase {


    @Autowired
    private StudentRepository studentRepository;

    @Scheduled(fixedDelay = 1000 * 60)
    public void testDataBase() {
        List<Student> studentList =  studentRepository.findAll();
        studentList.forEach( student -> System.out.println(student.getName() + " "  + student.getLastName()));
    }

}
