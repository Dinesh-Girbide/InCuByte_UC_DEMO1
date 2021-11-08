package com.app.repo;

import com.app.pojo.Student;
import io.micronaut.data.repository.CrudRepository;


public interface StudentRepo extends CrudRepository<Student, Integer> {


}
