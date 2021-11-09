package com.app.service;

import com.app.pojo.Teacher;
import com.app.repo.TeacherRepository;


public class TeacherService {

  private TeacherRepository teacherRepository;

  public TeacherService(TeacherRepository teacherRepository) {
    this.teacherRepository = teacherRepository;
  }

  public Iterable<Teacher> getTeacherList() {
    return teacherRepository.findAll();
  }

}
