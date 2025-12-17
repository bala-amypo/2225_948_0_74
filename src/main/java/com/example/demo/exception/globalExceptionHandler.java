package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.


@RestControllerAdvice
public class globalExceptionHandler{

    @ExceptionHandler(MethodArgumentNotValidException.class)

}