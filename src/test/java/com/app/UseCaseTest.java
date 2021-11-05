package com.app;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.app.repo.CrudRepository;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
@AnalyzeClasses(packages = "com.app")
public class UseCaseTest {
//  @ArchTest
//  static final ArchRule class_should_have_name_ending_with_the_word_repository =
//      classes()
//          .that().resideInAPackage("..repo..")
//          .should().haveSimpleNameEndingWith("Repo");

  @ArchTest
  static final ArchRule class_implementing_crudrepository_should_have_name_ending_with_repository=
      classes().that().implement(CrudRepository.class)
          .should().haveSimpleNameEndingWith("Repo");

}
