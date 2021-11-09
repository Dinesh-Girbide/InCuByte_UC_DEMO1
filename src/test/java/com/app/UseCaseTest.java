package com.app;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import io.micronaut.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@AnalyzeClasses(packages = "com.app")
public class UseCaseTest {

  @ArchTest
  static final ArchRule interface_extending_crudrepository_should_have_name_ending_with_repository =
      classes().that().areInterfaces().should().beAssignableTo(CrudRepository.class).andShould()
          .haveSimpleNameEndingWith("Repository");

  @ArchTest
  static final ArchRule class_residing_in_service_package_should_have_name_ending_with_service =
      classes().that().resideInAPackage("..service..").should()
          .haveSimpleNameEndingWith("Service");

  @ArchTest
  static final ArchRule class_residing_in_controller_package_should_be_annotated_with_restcontroller_annotation =
      classes().that().resideInAPackage("..controller..").should()
          .beAnnotatedWith(RestController.class);


  @ArchTest
  static final ArchRule class_residing_in_controller_package_should_have_name_ending_with_controller =
      classes().that().resideInAPackage("..controller..").should()
          .haveSimpleNameEndingWith("Controller");

  @ArchTest
  static final ArchRule layer_check =
      layeredArchitecture()
          .layer("Controller").definedBy("..controller..")
          .layer("Service").definedBy("..service..")
          .layer("Repository").definedBy("..repo..")
          .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
          .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service")
          .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller");

}