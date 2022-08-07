package com.example.demo.web.controller;

import com.example.demo.jpa.entity.Class;
import com.example.demo.jpa.entity.Student;
import com.example.demo.jpa.repository.ClassRepository;
import com.example.demo.jpa.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/class")
public class ClassController {

    private final ClassRepository classRepository;
    private final StudentRepository studentRepository;

    public ClassController(ClassRepository classRepository, StudentRepository studentRepository) {
        this.classRepository = classRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/{class_name}/students")
    public ResponseEntity  getAllStudentsFromClass(@PathVariable("class_name") String className) {
        Class classEntity = classRepository.findByName(className);
        if (classEntity == null) {
            return new ResponseEntity<String>("No such class could be found", HttpStatus.BAD_REQUEST);
        }
        List<Student> students = studentRepository.findAllByClassId(classEntity.getId());
        return ResponseEntity.ok(students);
    }
}
