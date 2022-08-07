package com.example.demo.jpa.repository;

import com.example.demo.jpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    List<Teacher> findAllBySubjectId(Integer id);
}
