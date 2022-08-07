package com.example.demo.web.controller;


import com.example.demo.jpa.entity.Teacher;
import com.example.demo.jpa.repository.TeacherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TeacherController {

    private final TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @RequestMapping(method = RequestMethod.GET,
            // http: //localhost:8080/api/students
            path = "/api/teachers")
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        ResponseEntity<List<Teacher>> response = new ResponseEntity<>(teachers, HttpStatus.OK);
        return response;
    }

}
