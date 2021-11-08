package com.app;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import io.micronaut.data.repository.CrudRepository;

@AnalyzeClasses(packages = "com.app.repo")
public class UseCaseTest {

  @ArchTest
  static final ArchRule interface_extending_crudrepository_should_have_name_ending_with_repository =
      classes().that().implement(CrudRepository.class)
          .should().haveSimpleNameEndingWith("Repo");


  @ArchTest
  static final ArchRule class_residing_in_service_package_should_have_name_ending_with_services =
      classes().that().resideInAPackage("com.app.service").should()
          .haveSimpleNameEndingWith("Services");
  @ArchTest
  static final ArchRule class_residing_in_controller_package_should_have_name_ending_with_controller=
      classes().that().resideInAPackage("com.app.controller").should()
          .haveSimpleNameEndingWith("Controller");
}