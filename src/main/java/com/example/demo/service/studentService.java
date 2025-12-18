package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;

public interface studentService {

    List<studentEntity> getAll();

    studentEntity addStudent(studentEntity student);

    studentEntity getbyId(Long id);

    studentEnity updateByid(Long id,studentEntity newstu)

    String deleteby(Long id);
}
