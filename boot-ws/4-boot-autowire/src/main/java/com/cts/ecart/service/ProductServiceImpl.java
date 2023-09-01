package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDaoImpl;

//@Service(value = "prodService")
@Service
public class ProductServiceImpl {
	
	@Autowired
	private ProductDaoImpl prodDao;
	
	public ProductServiceImpl() {
		System.out.println(">> ProductServiceImpl object created..");
	}
	
	
	public void f1() {
		System.out.println(">>> ProductServiceImpl :: f1 method..");
		prodDao.save();
	}

}
