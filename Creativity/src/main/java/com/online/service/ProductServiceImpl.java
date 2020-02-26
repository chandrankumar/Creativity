package com.online.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.dao.ProductDaoImpl;
import com.online.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDaoImpl productDao;
	
	
	@Override
	public void addProduct(Product product) {
		
		productDao.addProduct(product);
	}


	public List<Product> retrieveProductDetails() {
		return productDao.retrieveProductDetails();
	}

	
}
