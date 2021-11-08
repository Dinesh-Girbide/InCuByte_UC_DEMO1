package com.app.controller;

import com.app.repo.StudentRepo;
import com.app.service.StudentServices;
import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  private StudentServices studentServices;
  private StudentRepo s;

  public StudentController(StudentServices studentServices,StudentRepo s) {
    this.studentServices = studentServices;
    this.s=s;
  }
}
