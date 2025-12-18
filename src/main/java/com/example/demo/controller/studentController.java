package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;

@RestController
@RequestMapping("/student")
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

    @GetMapping("/get/{id}")
    public studentEntity getbyId(PathVariable Long id){
        return service.getId(id);
    }

    @PutMapping("/update/{id}")
    public studentEnity updateByid(@PathVariable Long id,@Valid @RequestBody studentEntity newstu){
        return service.updateById(id,newstu);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByID(@PathVariable Long id){
        return service.deleteByID(id);
        return "Deleted Successfully !";

    }
}
