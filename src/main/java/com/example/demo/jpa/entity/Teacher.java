package com.example.demo.jpa.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "teacher")
@ToString
public class Teacher {
    @Id
    private  Integer id;
private String firstName;
private String lastName;
private Long salary;
private Integer subjectId;
}
