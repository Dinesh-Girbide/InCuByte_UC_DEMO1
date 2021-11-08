package com.app.controller;

import com.app.repo.StudentRepo;
import com.app.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  private StudentService studentServices;
  private StudentRepo s;

  public StudentController(StudentService studentServices,StudentRepo s) {
    this.studentServices = studentServices;
    this.s=s;
  }
}
