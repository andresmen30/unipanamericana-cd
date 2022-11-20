package com.unipanamericana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unipanamericana.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
