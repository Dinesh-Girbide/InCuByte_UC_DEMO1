package com.app.service;


import com.app.pojo.Student;
import com.app.repo.StudentRepo;
import jakarta.inject.Inject;

public class StudentServices {

  @Inject
  private StudentRepo studentRepo;

  public Iterable<Student> getStudentList() {
    return studentRepo.findAll();
  }

}
