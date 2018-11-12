package com.ruwan.boot.services;

import com.ruwan.boot.domain.StudentDTO;

import java.util.List;

public interface StudentServices {

    List<StudentDTO> findAllStudents();

    String saveStudent(StudentDTO studentdata);

    void updateUser();

    String updateStudent(StudentDTO newStudentData);
}
