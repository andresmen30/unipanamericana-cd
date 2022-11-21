package com.unipanamericana.controller;

import com.unipanamericana.dto.StudentDto;
import com.unipanamericana.service.StudentService;
import com.unipanamericana.util.ConstantsUtil;
import com.unipanamericana.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
        return ResponseEntity.ok("OK SAPO HPTA LO LOGRE!!!!");
    }

    @PostMapping()
    private ResponseEntity insert(@Valid @RequestBody final StudentDto studentDto) {
        studentService.insert(studentDto);
        return ResponseUtil.result(ConstantsUtil.MESSAGE_CREATED, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    private ResponseEntity update(@Valid @RequestBody final StudentDto studentDto, @PathVariable final Long id) {
        if (studentService.update(studentDto, id)) {
            return ResponseUtil.result(ConstantsUtil.MESSAGE_UPDATE, HttpStatus.OK);
        }
        return ResponseUtil.result(ConstantsUtil.ERROR_MESSAGE_DATA_NOT_FOUND, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity delete(@PathVariable final Long id) {
        if (studentService.delete(id)) {
            return ResponseUtil.result(ConstantsUtil.MESSAGE_DELETE, HttpStatus.OK);
        }
        return ResponseUtil.result(ConstantsUtil.ERROR_MESSAGE_DATA_NOT_FOUND, HttpStatus.OK);
    }

}
