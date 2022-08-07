package com.example.demo.jpa.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "subject")
@ToString
public class Subject {

    @Id
    private Integer id;
    private String subjectName;
    private Boolean teza;
}
