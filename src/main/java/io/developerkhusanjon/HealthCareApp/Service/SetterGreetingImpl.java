package io.developerkhusanjon.HealthCareApp.Service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingImpl implements Greeting{
    @Override
    public String sayHello() {
        return "Setter Greeting Impl";
    }
}
