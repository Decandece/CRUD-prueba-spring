package com.example.CrudRapido.service;

import com.example.CrudRapido.entity.Student;
import com.example.CrudRapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(long id){
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(long id){
        studentRepository.deleteById(id);
    }

}
