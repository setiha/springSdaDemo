package com.example.demo.jpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "student")
@ToString
public class Student {

    @Id
    private  Integer id;

    @Column(name = "first_name")
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer classId;


}