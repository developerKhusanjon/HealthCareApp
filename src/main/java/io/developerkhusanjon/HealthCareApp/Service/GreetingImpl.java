package io.developerkhusanjon.HealthCareApp.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingImpl implements Greeting {
    @Override
    public String sayHello() {
        return "OKY-DOKY";
    }
}
