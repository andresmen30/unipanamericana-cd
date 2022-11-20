package com.unipanamericana.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.factory.Mappers;

import com.unipanamericana.dto.StudentDto;
import com.unipanamericana.entity.Student;

@Mapper(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface StudentMapper {

   StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

   StudentDto map(Student student);

   List<StudentDto> map(List<Student> students);

}
