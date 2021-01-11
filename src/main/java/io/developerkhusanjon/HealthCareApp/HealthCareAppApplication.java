package io.developerkhusanjon.HealthCareApp;

import io.developerkhusanjon.HealthCareApp.Controller.ConstructorBasedController;
import io.developerkhusanjon.HealthCareApp.Controller.MyController;
import io.developerkhusanjon.HealthCareApp.Controller.PropertyBasedController;
import io.developerkhusanjon.HealthCareApp.Controller.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HealthCareAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(HealthCareAppApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("\n -----Primary Bean based controller");
		System.out.println(myController.getGreeting());

		System.out.println("\n ----Property based controller");
		PropertyBasedController propertyBasedController = (PropertyBasedController) ctx.getBean("propertyBasedController");
		System.out.println(propertyBasedController.getData());

		System.out.println("\n ----Setter based controller");
		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting().sayHello());

		System.out.println("\n -----Constructor based controller");
		ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean("constructorBasedController");
		System.out.println(constructorBasedController.getGreeting().sayHello());

	}

}
