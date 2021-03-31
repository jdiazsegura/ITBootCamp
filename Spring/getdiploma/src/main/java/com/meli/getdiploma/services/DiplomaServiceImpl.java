package com.meli.getdiploma.services;

import com.meli.getdiploma.dtos.DiplomaDTO;
import com.meli.getdiploma.dtos.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class DiplomaServiceImpl implements DiplomaService{

    @Override
    public Double getAverage(StudentDTO studentDTO) {
        var sum = 0.0;
        Double total = Double.valueOf(studentDTO.getSubjects().size());
        for(var subject:studentDTO.getSubjects()){
            sum += subject.getGrade();
        }
        return sum/total;
    }

    @Override
    public DiplomaDTO generateDiploma(StudentDTO studentDTO) {
        var avg = getAverage(studentDTO);
        var student =  new DiplomaDTO("Felicitaciones",avg,studentDTO);
        if(avg > 9.0){
            student.setMessage("Se le reconoce por su excelencia");
        }
        return student;
    }
}
