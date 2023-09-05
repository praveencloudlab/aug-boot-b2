package com.cts.ecart;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.CategoryRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CategoryRepository catRepo = context.getBean(CategoryRepository.class);
		//catRepo.findAll().forEach(System.out::println);
		
		/*
		  Category catObj = catRepo.findById(1).orElse(null);
		  if(catObj!=null) {
			  System.out.println(catObj);
		  }else {
			  System.out.println("ID not found");
		  }
		  */
		
		// final all categories by name
		
//		List<Category> catObjs = catRepo.findByCategoryTitle("Laptops");
//		if(catObjs.size()!=0) {
//			catObjs.forEach(System.out::println);
//		}else {
//			System.out.println("Not Found");
//		}
		
		
		List<Category> catObjs = catRepo.findByCategoryTitleLike("%e%");
		if(catObjs.size()!=0) {
			catObjs.forEach(System.out::println);
		}else {
			System.out.println("Not Found");
		}
	}

}
