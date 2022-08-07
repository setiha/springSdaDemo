package com.example.demo.web.controller;

import com.example.demo.jpa.entity.Student;
import com.example.demo.jpa.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    @RequestMapping(method = RequestMethod.GET,
            // http: //localhost:8080/api/students
            path = "/api/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        ResponseEntity<List<Student>> response = new ResponseEntity<>(students, HttpStatus.OK);
        return response;
    }
    /*@RequestMapping(method = RequestMethod.GET,
            // http: //localhost:8080/api/students
            path = "/api/studentsByName")
    public ResponseEntity<List<Student>> getStudentByFirstName(String name) {
        List<Student> studentByName = studentRepository.findByName(name);
        return ResponseEntity.ok(studentByName);
    }*/


    @GetMapping()
    public ResponseEntity<List<Student>> getByName(@RequestParam(name = "first_name") String firstName) {
        List<Student> students;
        if (firstName == null) {
            students = studentRepository.findAll();
        } else {
            students = studentRepository.findByName(firstName);
        }

        //ResponseEntity<List<Student>> response = new ResponseEntity<>(students, HttpStatus.OK);
        return ResponseEntity.ok(students);
    }
}
