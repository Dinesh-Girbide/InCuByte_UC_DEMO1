package com.app.service;

import com.app.pojo.Teacher;
import com.app.repo.TeacherRepo;


public class TeacherService {

  private TeacherRepo teacherRepo;

  public TeacherService(TeacherRepo teacherRepo) {
    this.teacherRepo = teacherRepo;
  }

  public Iterable<Teacher> getTeacherList() {
    return teacherRepo.findAll();
  }

}
