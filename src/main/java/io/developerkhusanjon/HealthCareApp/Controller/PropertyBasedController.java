package io.developerkhusanjon.HealthCareApp.Controller;

import io.developerkhusanjon.HealthCareApp.Service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedController {


    @Autowired @Qualifier("propertyGreetingImpl")
    public Greeting greeting;

    public String getData(){
        return greeting.sayHello();
    }
}
