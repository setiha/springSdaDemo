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
@Entity(name = "grade")
@ToString
public class Grade {

    @Id
    private  Integer id;
    private LocalDate date;
    private Integer studentId;
    private Integer teacherId;
    private Integer subjectId;

}
