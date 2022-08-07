package com.example.demo.jpa.repository;

import com.example.demo.jpa.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    Subject findSubjectBySubjectName(String name);

}
