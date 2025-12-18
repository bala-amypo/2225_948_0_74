package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.studentEntity;

public interface studentService {

    List<studentEntity> getAll();

    studentEntity addStudent(studentEntity student);

    studentEntity getById(Long id);

    studentEntity updateById(Long id, studentEntity newstu);

    String deleteByID(Long id);
}
