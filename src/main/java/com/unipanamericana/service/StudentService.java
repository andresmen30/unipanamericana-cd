package com.unipanamericana.service;

import com.unipanamericana.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAll();

    void insert(final StudentDto studentDto);

    boolean update(final StudentDto studentDto, final Long id);

    boolean delete(final Long id);

}
