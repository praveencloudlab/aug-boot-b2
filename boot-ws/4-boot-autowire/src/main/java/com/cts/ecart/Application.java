package com.cts.ecart;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//ProductServiceImpl ps=(ProductServiceImpl) context.getBean("prodService");
		//ProductServiceImpl ps = context.getBean("prodService",ProductServiceImpl.class);
		ProductServiceImpl ps = context.getBean(ProductServiceImpl.class);
		ps.f1();
		
	
	}

}
