package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    private Greeting greeting;

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public String getGreeting(){

        return greeting.sayHello();
    }
}
