package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import com.example.demo.exception.StudentNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

    @Override
    public List<StudentEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return repo.save(student);
    }

    @Override
    public StudentEntity getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student ID not Found"));
    }

    @Override
    public StudentEntity updateById(Long id, StudentEntity newstu) {
        StudentEntity existing = getById(id);
        newstu.setId(existing.getId());
        return repo.save(newstu);
    }

    @Override
    public String deleteByID(Long id) {
        StudentEntity data = getById(id);
        repo.deleteById(data.getId());
        return "Deleted Successfully!";
    }
}
