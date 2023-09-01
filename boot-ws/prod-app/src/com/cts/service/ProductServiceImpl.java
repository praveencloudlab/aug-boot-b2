package com.cts.service;

import com.cts.ecart.dao.ProductDaoImpl;

public class ProductServiceImpl {

	
	private ProductDaoImpl prodDao; // dependency

	public void setProdDao(ProductDaoImpl prodDao) {
		this.prodDao = prodDao;
	}

	public void saveProduct() {
		System.out.println("SERVICE:: ProductServiceImpl");
		prodDao.save(); // dao

	}

}
