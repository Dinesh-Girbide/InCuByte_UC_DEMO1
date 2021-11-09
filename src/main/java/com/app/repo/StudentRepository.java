package com.app.repo;

import com.app.pojo.Student;
import io.micronaut.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Integer> {


}
