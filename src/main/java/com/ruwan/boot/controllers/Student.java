//package com.ruwan.boot.controllers;
//
//import com.ruwan.boot.domain.StudentDTO;
//import com.ruwan.boot.services.StudentServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/student")
//public class Student {
//
//    @Autowired
//    private StudentServices studentServices;
//
//    @GetMapping("/get")
//    public List<StudentDTO> allStudents(){
//        return studentServices.findAllStudents();
//    }
//
//    @PostMapping("/add")
//    public String addStudent(@RequestBody StudentDTO Studentdata){
//        return studentServices.saveStudent(Studentdata);
//    }
//
//    @PutMapping("/update")
//    public String updateStudent(@RequestBody StudentDTO newStudentData){
//
//        studentServices.updateStudent(newStudentData);
//    }
//
//
//
//}
