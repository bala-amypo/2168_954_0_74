package com.example.demo.service.Impl;

import java.util.*;
import orgspringframework.stereotype.service;
import com.example.demo.entity.Student;

@service
public class StudentserviceImpl implement Studentservice{
    private final Map<Long,Student>store = new HashMap<>();
    private long counter = 1;

    
}