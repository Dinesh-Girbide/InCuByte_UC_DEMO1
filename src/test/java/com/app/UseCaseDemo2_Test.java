package com.app;

import com.app.repo.StudentRepo;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class UseCaseDemo2_Test {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        System.out.println("Hello");
        System.out.println(StudentRepo.class.getName());
        Assertions.assertTrue(application.isRunning());
    }

}
