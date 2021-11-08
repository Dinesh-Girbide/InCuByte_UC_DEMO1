package com.app.service;


import com.app.pojo.Student;
import com.app.repo.StudentRepo;
import jakarta.inject.Singleton;

@Singleton
public class StudentServices {

  private StudentRepo studentRepo;

  public StudentServices(StudentRepo studentRepo) {
    this.studentRepo = studentRepo;
  }

  public Iterable<Student> getStudentList() {
    return studentRepo.findAll();
  }

}
