package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.GreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ConstructorBasedControllerTest {

    ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        constructorBasedController = new ConstructorBasedController(new GreetingImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorBasedController.getGreeting().sayHello());
    }
}