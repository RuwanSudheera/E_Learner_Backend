//package com.ruwan.boot.services.implementation;
//
//import com.ruwan.boot.domain.StudentDTO;
//import com.ruwan.boot.repositories.StudentRepository;
//import com.ruwan.boot.services.StudentServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentServiceimpl implements StudentServices {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Override
//    public List<StudentDTO> findAllStudents() {
//        List<StudentDTO> allStudents = studentRepository.findAll();
//        return allStudents;
//    }
//
//    @Override
//    public String saveStudent(StudentDTO studentdata) {
//        studentRepository.save(studentdata);
//        return "Data saved";
//    }
//
//    @Override
//    public String updateStudent(StudentDTO newStudentData) {
//        String msg = null;
//        if (newStudentData.getId() != null){
//            studentRepository.save(newStudentData);
//            msg = "Data updated";
//        }else {
//            msg="Error";
//        }
//
//        return msg;
//    }
//}