package com.app.controller;

import com.app.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  private StudentService studentServices;
  //private StudentRepository s;

  public StudentController(StudentService studentServices/*,StudentRepository s*/) {
    this.studentServices = studentServices;
    //this.s=s;
  }
}
