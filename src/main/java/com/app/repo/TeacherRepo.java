package com.app.repo;

import com.app.pojo.Teacher;
import io.micronaut.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher, Integer> {

}
