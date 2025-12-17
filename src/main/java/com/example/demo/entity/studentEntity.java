package com.example.demo.entity;

import jakarta.persistence.*;


@entity
public class studentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Long id;

    @NotBlank()
    private String name;

    @Email(message = "Email Format is not Valid")
    private String email;
   

}