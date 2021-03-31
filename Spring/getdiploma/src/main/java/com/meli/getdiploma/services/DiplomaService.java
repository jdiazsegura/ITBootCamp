package com.meli.getdiploma.services;

import com.meli.getdiploma.dtos.DiplomaDTO;
import com.meli.getdiploma.dtos.StudentDTO;

public interface DiplomaService {

    Double getAverage(StudentDTO studentDTO);

    DiplomaDTO generateDiploma(StudentDTO studentDTO);
}
