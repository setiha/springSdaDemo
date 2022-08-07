package com.example.demo.web.controller;

import com.example.demo.jpa.entity.Subject;
import com.example.demo.jpa.repository.SubjectRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SubjectController {
    private final SubjectRepository subjectRepository;

    public SubjectController(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }


    @RequestMapping(method = RequestMethod.GET,
            // http: //localhost:8080/api/subject
            path = "/api/subjects")
    public ResponseEntity<List<Subject>> getAllSubjects() {
        List<Subject> subjects = subjectRepository.findAll();
        ResponseEntity<List<Subject>> response = new ResponseEntity<>(subjects, HttpStatus.OK);
        return response;
    }

}
