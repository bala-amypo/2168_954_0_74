package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Studententity;

public interface StudentService{
    Studententity saveData(Studententity st);
    Studententity insertStdententity(Studententity newStudent);
    List<Studententity>getAllStudententity();
    Optional<Studententity>getOneStudententity(Long id);
    void deleteStudent(Long id);
    Student insertStudententity(Student st);
}