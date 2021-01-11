package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

    private Greeting greeting;


    public Greeting getGreeting() {
        return greeting;
    }

    @Autowired
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
}
