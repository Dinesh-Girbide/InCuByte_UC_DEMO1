package com.app.service;


import com.app.pojo.Student;
import com.app.repo.StudentRepo;


public class StudentService {

  private StudentRepo studentRepo;

  public StudentService(StudentRepo studentRepo) {
    this.studentRepo = studentRepo;
  }

  public Iterable<Student> getStudentList() {
    return studentRepo.findAll();
  }

}
