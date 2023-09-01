package com.cts.ecart;
//http://www.ecart.cts.com

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication() // auto discover as well container
//@ComponentScan("com")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}

}
