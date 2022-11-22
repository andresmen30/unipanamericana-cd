package com.unipanamericana.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ToString
public class StudentDto {

    @NotBlank
    private String name;
    private String lastName;
    @NotNull
    private int age;
    @NotBlank
    private String cellPhone;
    @NotBlank
    private String dni;

}
