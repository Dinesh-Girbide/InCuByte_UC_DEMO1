package com.app.controller;

import com.app.service.TeacherService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

  private TeacherService teacherService;

  public TeacherController(TeacherService teacherService) {
    this.teacherService = teacherService;
  }
}
