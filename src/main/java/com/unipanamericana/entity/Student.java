package com.unipanamericana.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String lastName;

    private int age;

    private String cellPhone;

    private String dni;

}
