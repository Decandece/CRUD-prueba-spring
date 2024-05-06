package com.example.CrudRapido.controller;

import com.example.CrudRapido.entity.Student;
import com.example.CrudRapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getStudent();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student) {
        System.out.println("Datos recibidos: " + student.toString());
        studentService.saveOrUpdate(student);

    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getStudentbyId(@PathVariable("studentId") Long studentId) {
       return studentService.getStudent(studentId);
    }

}
