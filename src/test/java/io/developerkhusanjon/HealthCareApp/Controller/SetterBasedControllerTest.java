package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.GreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreeting(new GreetingImpl());
    }

    @Test
    void getData() {
        System.out.println(setterBasedController.getGreeting());
    }
}