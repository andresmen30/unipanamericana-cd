package com.unipanamericana.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unipanamericana.dto.StudentDto;
import com.unipanamericana.mapper.StudentMapper;
import com.unipanamericana.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

   private final StudentRepository studentRepository;

   StudentServiceImpl(final StudentRepository studentRepository) {
      this.studentRepository = studentRepository;
   }

   @Override
   public List<StudentDto> findAll() {
      return StudentMapper.INSTANCE.map(studentRepository.findAll());
   }
}
