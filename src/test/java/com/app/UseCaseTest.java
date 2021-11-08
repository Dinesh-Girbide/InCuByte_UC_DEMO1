package com.app;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import io.micronaut.data.repository.CrudRepository;
import javax.persistence.Entity;
import org.springframework.web.bind.annotation.RestController;

@AnalyzeClasses(packages = "com.app")
public class UseCaseTest {

  @ArchTest
  static final ArchRule interface_extending_crudrepository_should_have_name_ending_with_repository =
      classes().that().implement(CrudRepository.class)
          .should().haveSimpleNameEndingWith("Repo");


  @ArchTest
  static final ArchRule class_residing_in_service_package_should_have_name_ending_with_services =
      classes().that().resideInAPackage("..service..").should()
          .haveSimpleNameEndingWith("Services");
  @ArchTest
  static final ArchRule class_residing_in_controller_package_should_have_name_ending_with_controller =
      classes().that().resideInAPackage("com.app.controller").should()
          .haveSimpleNameEndingWith("Controller");
  @ArchTest
  static final ArchRule class_residing_in_controller_package_should_be_annotated_with_controller_annotation =
      classes().that().resideInAPackage("com.app.controller").should()
          .beAnnotatedWith(RestController.class);
  @ArchTest
  static final ArchRule class_residing_in_pojo_package_should_be_annotated_with_entity_annotation =
      classes().that().resideInAPackage("com.app.pojo").should()
          .beAnnotatedWith(Entity.class);


  //  @ArchTest
//  static final ArchRule class_annotated_with_controller_annotation_should_not_depends_directly_on_repository =
//      layeredArchitecture()
//          .layer("Controller").definedBy("..controller..")
//          .layer("Service").definedBy("..service..")
//          .layer("Repository").definedBy("..repo..")
//
//          .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
//          .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service")
//          .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller");
  @ArchTest
  static final ArchRule class_annotated_with_controller_annotation_should_not_depends_directly_on_repository =
      noClasses().that().resideInAPackage("com.app.controller").should().dependOnClassesThat()
          .resideInAPackage("com.app.repo");
}