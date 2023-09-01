package com.cts.ecart.service;

import org.springframework.stereotype.Service;

@Service(value = "prodService")
public class ProductServiceImpl {
	
	public ProductServiceImpl() {
		System.out.println(">> ProductServiceImpl object created..");
	}
	
	public void f1() {
		System.out.println(">>> ProductServiceImpl :: f1 method..");
	}

}
