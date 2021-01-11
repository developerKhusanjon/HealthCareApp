package io.developerkhusanjon.HealthCareApp.Service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingImpl implements Greeting{
    @Override
    public String sayHello() {
        return "Property Greeting Implementation";
    }
}
