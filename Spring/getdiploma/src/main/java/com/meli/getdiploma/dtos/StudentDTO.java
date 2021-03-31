package com.meli.getdiploma.dtos;

import lombok.*;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String name;
    private ArrayList<SubjectDTO> subjects;
}
