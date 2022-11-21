package com.unipanamericana.service;

import com.unipanamericana.dto.StudentDto;
import com.unipanamericana.entity.Student;
import com.unipanamericana.mapper.StudentMapper;
import com.unipanamericana.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void insert(final StudentDto studentDto) {
        final Student student = StudentMapper.INSTANCE.map(studentDto);
        studentRepository.save(student);
    }

    @Override
    public boolean update(final StudentDto studentDto, final Long id) {
        if (studentRepository.existsById(id)) {
            final Student student = StudentMapper.INSTANCE.map(studentDto);
            student.setId(id);
            studentRepository.save(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(final Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
