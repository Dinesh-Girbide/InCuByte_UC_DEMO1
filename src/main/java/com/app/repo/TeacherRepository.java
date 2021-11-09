package com.app.repo;

import com.app.pojo.Teacher;
import io.micronaut.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

}
