package com.unipanamericana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Student {

   @Id
   @GeneratedValue
   private Long id;

   private String name;

   private String lastName;

}
