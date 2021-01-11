package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedController {
    private final Greeting greeting;

    public ConstructorBasedController(Greeting greeting) {
        this.greeting = greeting;
    }

    public Greeting getGreeting() {
        return greeting;
    }
}
