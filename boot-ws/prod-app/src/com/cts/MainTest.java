package com.cts;

import com.cts.ecart.dao.ProductDaoImpl;
import com.cts.service.ProductServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		
		
		ProductDaoImpl prodDao=new  ProductDaoImpl(); // dependency
		ProductServiceImpl ps=new ProductServiceImpl(); // dependent
		
		ps.setProdDao(prodDao); // DI : Dependency Injection: Passing dependency object to the dependent object
		
		ps.saveProduct();

	}

}
