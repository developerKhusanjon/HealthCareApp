package io.developerkhusanjon.HealthCareApp.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingImpl implements Greeting {
    @Override
    public String sayHello() {
        return "OKY-DOKY";
    }
}
