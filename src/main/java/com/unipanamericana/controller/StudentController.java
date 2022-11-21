package com.unipanamericana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unipanamericana.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

   private final StudentService studentService;

   @Autowired
   StudentController(final StudentService studentService) {
      this.studentService = studentService;
   }

   @GetMapping()
   private ResponseEntity getAll() {
      return ResponseEntity.ok("PRUEBA OK..");
   }

   @PostMapping()
   private ResponseEntity insert() {
      return null;
   }

}
