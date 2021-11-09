package com.app.service;


import com.app.pojo.Student;
import com.app.repo.StudentRepository;


public class StudentService {

  private StudentRepository studentRepo;

  public StudentService(StudentRepository studentRepo) {
    this.studentRepo = studentRepo;
  }

  public Iterable<Student> getStudentList() {
    return studentRepo.findAll();
  }

}
