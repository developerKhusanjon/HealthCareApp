package io.developerkhusanjon.HealthCareApp.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getGreeting(){
        System.out.println("Hello fellas");

        return "Hi Buddy";
    }
}
