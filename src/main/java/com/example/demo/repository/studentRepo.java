package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRespository;
import org.springframework.studentRepo.*;
import com.example.demo.entity.studentEntity;

public interface studentRepo extends JpaRepository<studentEntity,Long> {

}