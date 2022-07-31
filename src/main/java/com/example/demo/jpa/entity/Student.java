package com.example.demo.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "student")
public class Student {

    @Id
    private  Integer id;

    @Column(name = "first_name")
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer classId;



}