package com.example.demo.controller;
import java.util.Collection;
import org.springfranework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
@RequestMapping("/student")
public class studentctl{

    @Autowired
    private Studentservice ser;

    //POST
    @PostMapping("/add")
    public Studententity addStudent(@RequestBody Studententity st){
        return
    } 
}