package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;
import com.cts.ecart.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductResourceController {
	
	@Autowired
	private ProductRepository prodRepo;
	
	//note: every browser by default supports only get request
	@GetMapping
	public List<Product> f1() {
		return prodRepo.findAll();
	}
	
	//receive request parameter from a client
	// pathVarible/RequestParam
	//pathVariable : {}
	//http://localhost:8080/api/products/Praveen
	@GetMapping("/{personName}")
	public String f111(@PathVariable String personName) {
		System.out.println("Person Name: "+personName);
		return "GET-REQUEST:: f111 method - "+personName;
	}
	
	// RequstParam
	//http://localhost:8080/api/products/name?pn=James
	@GetMapping("/name")
	public String f11(@RequestParam("pn") String s1) {
		System.out.println("Name: "+s1);
		return "GET-REQUEST:: f11 method - "+s1;
	}
	
	
	
	
	@PostMapping // post to client to server
	public String f2() {
		return "POST-REQUEST:: f2 method";
	}
	
	//Request Body
	@PostMapping("/save") // post to client to server
	public Product f22(@RequestBody Product prod) {
		System.out.println(prod);
		return prod;
	}
	
	
	
	@PutMapping // to update server data 
	public String f3() {
		return "PUT-REQUEST:: f3 method";
	}
	
	@PatchMapping // to update partial content 
	public String f4() {
		return "PATCH-REQUEST:: f4 method";
	}
	
	@DeleteMapping // delete data from server
	public String f5() {
		return "DELETE-REQUEST:: f5 method";
	}
	

}
