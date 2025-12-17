package com.example.demo.service.impl;

import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;


@Service
@servicepublic class studentServiceImpl implements studentService{

    @Autowired
    studentRepo repo;

    public List<studentEntity> getAll(){
        return repo.findAll();
    }
    public studentEntity addsStudent(studentEntity student){
        return repo.save(student);
    }

}
