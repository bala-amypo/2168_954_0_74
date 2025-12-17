package com.example.demo.service.Impl;

import java.util.*;
import orgspringframework.stereotype.service;
import com.example.demo.entity.Student;

@service
public class StudentserviceImpl implement Studentservice{
    private final Map<Long,Student>store = new HashMap<>();
    private long counter = 1;

    @Override
    public Student inserStudent(Student st){
        st.setId(counter);
        store.put(st.getId(),st);
        return st;
    }

    @Override
    public OPtional<Student>getOneStudent(Long id){
        return Optional.ofNullable(store.get(id));
    }
    @Override
    public void deleteStudent(Long id){
        store.remove(id);
    }
}