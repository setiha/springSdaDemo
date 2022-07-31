package com.example.demo.jpa.repository;

import com.example.demo.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//annotation for spring to create a bean of this "interface"
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    //JpaRepository ,<- holds functionality for data management
}
