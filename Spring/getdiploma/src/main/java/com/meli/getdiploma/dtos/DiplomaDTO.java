package com.meli.getdiploma.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiplomaDTO {

    private String message;
    private Double average;
    private StudentDTO student;
}
