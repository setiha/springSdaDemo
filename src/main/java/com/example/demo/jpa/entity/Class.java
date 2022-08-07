package com.example.demo.jpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "class")
@ToString
public class Class {

    @Id
    private  Integer id;
    private String name;

}
