package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.GreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyBasedControllerTest {

    PropertyBasedController propertyBasedController;

    @BeforeEach
    void setUp() {
        propertyBasedController = new PropertyBasedController();
        propertyBasedController.greeting = new GreetingImpl();
    }

    @Test
    void getData() {
        System.out.println(propertyBasedController.getData());
    }
}