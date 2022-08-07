package com.example.demo.jpa.repository;

import com.example.demo.jpa.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {

    Class findByName(String name);
}
