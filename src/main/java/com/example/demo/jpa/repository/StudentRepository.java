package com.example.demo.jpa.repository;

import com.example.demo.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

//annotation for spring to create a bean of  Simple JPARepository<Student, Integer>
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    //JpaRepository ,<- holds functionality for data management
    List<Student> findByName(String fn);
    List<Student> findStudentByLastName(String last);
    List<Student> findByNameAndLastName(String first, String last);




    List<Student>findAllByClassId(Integer last);
    List<Student>findAllByDateOfBirth(LocalDate first);
    List<Student>findAllByDateOfBirthIsBetween(LocalDate first, LocalDate last);





}
