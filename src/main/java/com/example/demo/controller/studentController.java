package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student) {
        return service.addStudent(student);
    }
}
