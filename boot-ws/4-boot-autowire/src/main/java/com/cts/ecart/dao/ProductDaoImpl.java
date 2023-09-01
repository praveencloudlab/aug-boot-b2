package com.cts.ecart.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {
	
	public void  save() {
		System.out.println(">> DAO:: product saved..");
	}

}
