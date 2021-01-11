package io.developerkhusanjon.HealthCareApp.Service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingImpl implements Greeting{
    @Override
    public String sayHello() {
        return "Constructor Greeting Impl";
    }
}
