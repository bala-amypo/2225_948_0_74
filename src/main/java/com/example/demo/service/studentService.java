package com.example.demo.service;

import com.example.demo.entity.studentEntity;
import java.util.List;

public interface studentService {

    List<studentEntity> getAll();

    studentEntity addStudent(studentEntity student);

    studentEntity getbyId(Long id);

     public studentEnity updateByid(Long id,studentEntity newstu)
}
